create schema esquema;
use LABMVC;

create table esquema.usuario(
  nombre varchar(100) primary key,
  contraseña varchar(100)
)

create table esquema.sala(
  identificador varchar(50) primary key,
  ubicacion varchar(100),
  capacidad int,
)

insert into esquema.usuario values ('Kevin','123');

create function esquema.validarUsuario(@nombre as varchar(100), @contraseña as varchar(100))
returns int
as 
begin
  declare @usuario as varchar(50);
  set @usuario = (select nombre from esquema.usuario where nombre = @nombre and contraseña = @contraseña);
  if @usuario != ''
  begin 
    return 1;
  end
return 0
end


create procedure esquema.ingresarSala
@identificador as varchar(50),
@ubicacion as varchar(100),
@capacidad as int
as
begin
	insert into esquema.sala values(@identificador,@ubicacion,@capacidad);
end


