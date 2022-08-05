import socket
import sys


sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)


server = ('localhost', 50001)
sock.bind(server)


sock.listen(1)

while True:
       
    connex, cliente = sock.accept()
    print('seconecton un cliente :)')
    while True:
        mensaje = connex.recv(1024).decode()
        print("cliente: ", mensaje)

        if mensaje == 'adios':
            break
        else:
            connex.send(input("YO: ").encode())

    print("pega la vuelta ", cliente)
    connex.close()
