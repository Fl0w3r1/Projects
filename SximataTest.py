#import Math

class Sxima:
    def __init__(self,onoma,xroma):
        self.onoma = onoma
        self.xroma = xroma
    
    def get_onoma(self):
        return self.onoma
    #def get_onoma(self,onoma):
    #    self.onoma = onoma

    def get_xroma(self):
        return self.xroma
    #def set_xroma(self,xroma):
    #    self.xroma = xroma

class Parallilogramo(Sxima):
    def __init__(self,onoma,xroma,mikos,platos):
        Sxima.__init__(self,onoma,xroma) #super().__init__(onoma,xroma)
        self.mikos = mikos
        self.platos = platos

    def get_mikos(self):
        return self.mikos
    #def set_mikos(self,mikos):
    #    self.mikos = mikos

    def get_platos(self):
        return self.platos
    #def set_platos(self,platos):
    #    self.platos = platos

    def get_emvado(self):
        return (self.mikos * self.platos)

    def get_perimetro(self):
        return (2 * (self.mikos + self.platos))

class Kiklos(Sxima):
    def __init__(self,onoma,xroma,aktina):
        Sxima.__init__(self,onoma,xroma) #super().__init__(onoma,xroma)
        self.aktina = aktina

    def get_aktina(self):
        return self.aktina
    #def set_aktina(self,aktina):
    #    self.aktina = aktina

    def get_emvado(self):
        #p = 3.14
        return (3.14 * (self.aktina ** 2)) #return (math.pi * (self.aktina ** 2))

    def get_perimetro(self):
        #p = 3.14
        return (2 * 3.14 * self.aktina) #return (2 * math.pi * self.aktina)

eisodos1 = input("Pliktrologise to onoma t parallilogramou: ")
eisodos2 = input("Pliktrologise to xroma t parallilogramou: ")
try:
    eisodos3 = float(input("Pliktrologise to mikos t parallilogramou: "))
except:
    print("Parakalo pliktrologise arithmo")
    eisodos3 = float(input("Pliktrologise to mikos t parallilogramou: "))
#else:
#    raise Exception("Den pliktrologises arithmo. To programma termatise")
try:
    eisodos4 = float(input("Pliktrologise to platos t parallilogramou: "))
except:
    print("Parakalo pliktrologise arithmo")
    eisodos4 = float(input("Pliktrologise to platos t parallilogramou: "))
#finally:
#    raise Exception("Den pliktrologisate arithmo. To programma termatise")

#eisodos3 = float(eisodos3)
#eisodos4 = float(eisodos4)

parallilogramo = Parallilogramo(eisodos1,eisodos2,eisodos3,eisodos4)
#parallilogramo = Parallilogramo(eisodos1,eisodos2,float(eisodos3),float(eisodos4))

#print("To xroma t parallilogramou einai:",parallilogramo.get_onoma())
#print("To onoma t parallilogramou einai:",parallilogramo.get_xroma())
print("To emvado t parallilogramou einai:",parallilogramo.get_emvado())
print("I perimetros t parallilogramou einai:",parallilogramo.get_perimetro())

eisodos5 = input("Pliktrologise to onoma t kiklou: ")
eisodos6 = input("Pliktrologise to xroma t kiklou: ")
try:
    eisodos7 = float(input("Pliktrologise to mikos tis aktinas t kiklou: "))
except:
    print("Parakalo pliktrologise arithmo")
    eisodos7 = float(input("Pliktrologise to mikos tis aktinas t kiklou: "))
#if eisodos7 != float():
#    raise Exception("Den pliktrologises arithmo. To programma termatise")

#eisodos7 = float(eisodos7)

kiklos = Kiklos(eisodos5,eisodos6,eisodos7)
#kiklos = Kiklos(eisodos5,eisodos6,float(eisodos7))

#print("To onoma t kiklou einai:",kiklos.get_onoma())
#print("To xroma t kiklou einai:",kiklos.get_xroma())
print("To emvado t kiklou einai:",kiklos.get_emvado())
print("I perimetros t kiklou einai:",kiklos.get_perimetro())

"""Opos exoume anaferei i Python den parexei prostasia (public, private, protected). Ara i xrisi
ton kataskevaston k eidika ton setter, den einai aparaititi"""