import csv

def percentile(values, p):
    values = sorted(values)
    index = max(0, int(round(p / 100 * len(values))) - 1)
    return values[index]

elapsed, stamps, passed = [], [], 0
with open("results.jtl", newline="") as f:
    for row in csv.DictReader(f):
        elapsed.append(int(row["elapsed"]))
        stamps.append(int(row["timeStamp"]))
        if row["success"].lower() == "true":
            passed += 1

total = len(elapsed)
errors = total - passed
error_pct = errors * 100.0 / total
duration = max((max(stamps) - min(stamps)) / 1000.0, 1)
throughput = total / duration

print("Total samples    :", total)
print("Failed samples   :", errors)
print("Error percentage : %.2f %%" % error_pct)
print("Average (ms)     : %.0f" % (sum(elapsed) / total))
print("Minimum (ms)     :", min(elapsed))
print("Maximum (ms)     :", max(elapsed))
print("90th percentile  :", percentile(elapsed, 90), "ms")
print("95th percentile  :", percentile(elapsed, 95), "ms")
print("Throughput       : %.2f requests/second" % throughput)

met = error_pct <= 1.0 and percentile(elapsed, 95) <= 2000
print("Completion criteria (error <= 1 % and 95th percentile <= 2000 ms) :",
      "MET" if met else "NOT MET")
