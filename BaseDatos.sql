create schema esquema;
use LABMVC;

create table esquema.usuario(
  nombre varchar(100) primary key,
  contraseņa varchar(100)
)

create table esquema.sala(
  identificador varchar(50) primary key,
  ubicacion varchar(100),
  capacidad int
)

create function esquema.validarUsuario(@nombre as varchar(100), @contraseņa as varchar(100))
returns int
as 
begin
  declare @usuario as varchar(50);
  set @usuario = (select nombre from esquema.usuario where nombre = @nombre and contraseņa = @contraseņa);
  if @usuario != ''
  begin 
    return 1;
  end
return 0
end

select esquema.validarUsuario()



