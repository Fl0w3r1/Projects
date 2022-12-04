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
MO_ntom = round(MO_ntom,2)
print("O mesos oros ton ntomaton einai:",MO_ntom)
print()

MO_pat = statistics.mean(patates)
MO_pat = round(MO_pat,2)
print("O mesos oros ton pataton einai:",MO_pat)
print()

MO_krem = statistics.mean(kremidia)
MO_krem = round(MO_krem,2)
print("O mesos oros ton kremidion einai:",MO_krem)
print()

#I ALLIOS
"""
athroisma_ntom = 0
for i in ntomates:
	athroisma_ntom += i
MO_ntom = athroisma_ntom / len(ntomates)
MO_ntom = round(MO_ntom,2)
print(MO_ntom)
print()

athroisma_pat = 0
for i in patates:
	athroisma_pat += i
MO_pat = athroisma_pat / len(patates)
MO_pat = round(MO_pat,2)
print(MO_pat)
print()

athroisma_krem = 0
for i in kremidia:
	athroisma_krem += i
MO_krem = athroisma_krem / len(kremidia)
MO_krem = round(MO_krem,2)
print(MO_krem)
print()
"""

#2o erotima
ntom_par = []
for i in range(len(imerominia)):
	if imerominia[i].weekday() == 4:
		ntom_par.append(ntomates[i])
MO_ntom_par = statistics.mean(ntom_par)
MO_ntom_par = round(MO_ntom_par,2)
print("O mesos oros ton ntomaton tin paraskevi einai:",MO_ntom_par)
print()

pat_par = []
for i in range(len(imerominia)):
	if imerominia[i].weekday() == 4:
		pat_par.append(patates[i])
MO_pat_par = statistics.mean(pat_par)
MO_pat_par = round(MO_pat_par,2)
print("O mesos oros ton pataton tin paraskevi einai:",MO_pat_par)
print()

krem_par = []
for i in range(len(imerominia)):
	if imerominia[i].weekday() == 4:
		krem_par.append(kremidia[i])
MO_krem_par = statistics.mean(krem_par)
MO_krem_par = round(MO_krem_par,2)
print("O mesos oros ton kremidion tin paraskevi einai:",MO_krem_par)
print()