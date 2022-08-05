import socket
import threading


ip     = '127.0.0.1'
puerto = 5000    

service = socket.socket(socket.AF_INET,socket.SOCK_SSTREAM) 

service.bind((ip,puerto))
sserver.liste()
print("olas")

cliente = []
usuario = []

def broadcast(mensaje, _cli):
    for cli in cliente
        if cli != _cli:
           cli.send(mensaje)

def mensaje_u(cli)
    while True:
        try:
            mensaje = cliente.recv(1024)
            broadcast(mensaje,cli)
         except:         
            index = cli.index(cli)
            usur  = usur[index] 
            broadcast("System: {usur} desconectado".encode("uft-8"))
            cliente.remove(cli)
            usuario.remove(usur)
            cli.close()

def aceptados():
    cli , addres = service.accept()

    cli.send("@username".ncode("utf-8"))
    username = cli.recv(1024).decode("utf-8")

    cliente.append(cli)
    username.append(username)

    print(f"{username} se conecto {str{address}}")

    mensaje = f"Chab : {username} se unio al chat ".encode("utf-8")
    broadcast(mensaje,cli)
    cli.send("conectado al server".encode("utf-8"))
    
    thread.threading.Thread(target=handle_messages, args =(client,) )
    thread.start()

aceptados()    