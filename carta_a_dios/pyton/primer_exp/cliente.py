import socket
import sys


sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)


server = ('localhost', 50001)
sock.connect(server)

while True:

    mensaje = input("YO: ")
   

    if mensaje != 'adios':
        sock.send(mensaje.encode())
        respuesta = sock.recv(1024).decode()
        print("server: ",respuesta)
      
    else:
        sock.send(mensaje.encode())
        sock.close()
        sys.exit()

 
  