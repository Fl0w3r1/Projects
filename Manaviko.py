import statistics
import datetime

imerominia = []
ntomates = []
patates = []
kremidia = []

file = open("stats.csv")
for line in file:
	x = line.split(";")
	ntomates.append(int(x[1]))
	patates.append(int(x[2]))
	kremidia.append(int(x[3]))
	y = x[0].split("/")
	z = datetime.date(int(y[2]),int(y[1]),int(y[0]))
	imerominia.append(z)
file.close()

#1o erotima
MO_ntom = statistics.mean(ntomates)
print("O mesos oros ton ntomaton einai:",MO_ntom)
print()
MO_pat = statistics.mean(patates)
print("O mesos oros ton pataton einai:",MO_pat)
print()
MO_krem = statistics.mean(kremidia)
print("O mesos oros ton kremidion einai:",MO_krem)
print()

#2o erotima
ntom_par = []
for i in range(len(imerominia)):
	if imerominia[i].weekday() == 4:
		ntom_par.append(ntomates[i])
athroisma_ntom = 0
for i in ntom_par:
	athroisma_ntom += i
MO_ntom_par = athroisma_ntom / len(ntom_par)
print("O mesos oros ton ntomaton tin paraskevi einai:",MO_ntom_par)
print()

pat_par = []
for i in range(len(imerominia)):
	if imerominia[i].weekday() == 4:
		pat_par.append(patates[i])
athroisma_pat = 0
for i in pat_par:
	athroisma_pat += i
MO_pat_par = athroisma_pat / len(pat_par)
print("O mesos oros ton pataton tin paraskevi einai:",MO_pat_par)
print()

krem_par = []
for i in range(len(imerominia)):
	if imerominia[i].weekday() == 4:
		krem_par.append(kremidia[i])
athroisma_krem = 0
for i in krem_par:
	athroisma_krem += i
MO_krem_par = athroisma_krem / len(krem_par)
print("O mesos oros ton kremidion tin paraskevi einai:",MO_krem_par)