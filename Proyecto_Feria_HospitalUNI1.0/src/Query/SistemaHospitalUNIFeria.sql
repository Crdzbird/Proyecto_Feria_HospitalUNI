Drop Database BaseDatosHospitalUNI;

Create Database BaseDatosHospitalUNI;

Use BaseDatosHospitalUNI;

Create Table Usuario
(
ID_Usuario int not null auto_increment primary key,
Privilegio Varchar (20) Default 'Público' not null,
Nombre_Usuario Varchar (500) unique not null, 
Correo_Usuario varchar(500),
Contrasena Varchar (500) not null,
Estado_Usuario boolean Default true not null, 
Check(Privilegio in ('Público','Administrador','Medico','Cajero','Paciente','Laboratorio','Enfermera'))
);

Create Table Cargo (
ID_Cargo int not null auto_increment unique Primary Key,
Fecha_Creacion date not null,
NombreCargo varchar (50) not null,
SalarioMin decimal(20,2) not null,
check(NombreCargo in('Gerente','Interno','Sala'))
);

Create Table Area_Trabajo (
ID_Area int not null auto_increment Primary Key,
NombreArea varchar(50) not null,
estado_area boolean default true
);

Create Table Pais(
id_pais int primary key auto_increment not null,
extranjero boolean,
pais_nacimiento varchar(100)
);

Create Table Departamento(
id_Departamento int primary key auto_increment not null,
id_pais int not null,
nombre_departamento varchar(50)not null,
foreign key(id_pais)references Pais(id_pais)
);

Create Table Municipio(
id_municipio int primary key auto_increment not null,
id_departamento int not null,
nombre_municipio varchar(50)not null,
foreign key(id_departamento)references Departamento(id_departamento)
);

Create Table Distrito(
id_distrito int primary key auto_increment not null,
id_municipio int not null,
numero_distrito int not null,
foreign key(id_municipio)references Municipio(id_municipio)
);

/*-------------------------------------*/
/*   MODULO CONTABLE*/
/*-------------------------------------*/

Create Table Proveedor(
ID_Proveedor int not null auto_increment unique,
Primary Key (ID_Proveedor),
Tipo_Proveedor Varchar (15) not null,
Nombre_Proveedor Varchar (50) not null,
No_RUC Varchar(15) not null,
Telefono_Proveedor Varchar (9) not null,
Direccion_Proveedor Varchar (100) Default 'Ninguno' not null,
Correo_Proveedor Varchar (50) Default 'Ninguno' not null,
Estado_Proveedor boolean Default true not null,
Check(Tipo_Proveedor in ('Laboratorio','Distribuidora'))
);

Create Table Producto (
ID_Producto int not null auto_increment unique,
Primary Key (ID_Producto),
Nombre_Producto Varchar (50) not null,
Codigo_Producto Varchar(50) not null,
Categoria Varchar (60) not null,
Descripcion Varchar (100) not null,
Controlado Varchar (2) Default 'No' not null,
Unidades_Disponibles int not null,
Precio_Venta_Unit Decimal (20,2) not null,
Stock_Min int not null,
ID_Proveedor int not null,
Foreign Key (ID_Proveedor) References Proveedor (ID_Proveedor),
Imagen_Producto longblob,
Margen_Ganancia Float not null,
Estado_Producto boolean Default true not null,
Desactivado_Directamente varchar (5) Default 'No' not null,
Check(Desactivado_Directamente in ('Si','No')),
Check(Controlado in ('Si','No')),
Check(Unidades_Disponibles >= 0),
Check(Precio_venta >= 0),
Check(Stock_Min > 0),
Check(Margen_Ganancia > 0)
);

Create Table Laboratorio(
ID_Laboratorio int not null auto_increment primary key,
Nombre_Laboratorio varchar(200)not null,
Direccion_Laboratorio varchar(500)not null,
Telefono_Laboratorio varchar(9)not null,
Correo_Laboratorio varchar(50) Default 'Ninguno' not null,
Estado_Laboratorio boolean Default true not null
);

Create Table Empleado_Laboratorio(
ID_Empleado int not null auto_increment primary key,
ID_Laboratorio int not null,foreign key(ID_Laboratorio)references Laboratorio(ID_Laboratorio),
ID_UsuarioLaboratorio int unique not null,
foreign key (ID_UsuarioLaboratorio)references Usuario(ID_Usuario),
PrimerNombre_Empleado Varchar (50) not null,
SegundoNombre_Empleado Varchar (50) not null,
PrimerApellido_Empleado Varchar (50) not null,
SegundoApellido_Empleado Varchar (50) not null,
Fecha_Contratacion date not null,
ID_Area Int not null,
Foreign Key (ID_Area) References Area_Trabajo (ID_Area),
ID_Cargo int not null, 
Foreign Key (ID_Cargo) References Cargo (ID_Cargo),
Estado boolean default true not null,
Telefono_Empleado Varchar (9) not null,
Cedula_Empleado Varchar (16) not null,
Correo_Empleado Varchar (50) Default 'Ninguno'not null,
Direccion_Empleado Varchar (200) not null,
Fotografia_Empleado longblob,
Sexo_Empleado varchar(25)not null,
Check(Sexo_Empleado in('Masculino','Femenino'))
);

Create Table Tipo_Cambio(
ID_Tipo_Cambio int not null auto_increment unique,
Primary Key (ID_Tipo_Cambio),
Tipo_Cambio Decimal (20,2) not null,
Fecha Datetime not null,
Estado_Tipo_Cambio boolean Default true not null
);

Create Table Compra(
ID_Compra int not null auto_increment unique,
Primary Key (ID_Compra),
ID_Proveedor int not null,
Foreign Key (ID_Proveedor) References Proveedor(ID_Proveedor),
ID_EmpleadoLaboratorio int not null,
Foreign Key (ID_EmpleadoLaboratorio) References Empleado_Laboratorio(ID_Empleado),
Fecha_Compra Datetime not null,
Tipo_Moneda Varchar (10) Default 'Córdobas' not null,
ID_Tipo_Cambio int not null,
Foreign key (ID_Tipo_Cambio) References Tipo_Cambio(ID_Tipo_Cambio),
Modo_Compra Varchar (10) Default 'Efectivo' not null,
Check(ModoCompra in ('Efectivo','Crédito')),
Check(Moneda in ('Córdobas','Dólares')),
Check(UnidsTotales_Compradas > 0),
check(TotalComprado > 0)
);

Create Table Detalle_Compra(
ID_Detalle_Compra int not null auto_increment unique,
Primary Key (ID_Detalle_Compra),
ID_Compra int not null,
Foreign Key (ID_Compra) References Compra (ID_Compra),
ID_Producto int not null,
Foreign Key (ID_Producto) References Producto (ID_Producto),
Fecha_Vencimiento date not null,
Unidades_Compradas int not null,
Costo_Compra_Unit Decimal (20,2) not null,
Descuento Float Default 0 not null,
Modo_Adquisicion varchar (20) Default 'Normal' not null,
Unids_Disponibles int not null,
Check(Unids_Disponibles >= 0),
Check(Modo_Adquisicion in ('Normal','Bonificación')),
Check(Unidades_Compradas > 0),
Check(Costo_Compra_Unit > 0),
Check(Descuento >= 0)
);


Create Table Devolucion_Compra(
ID_Devolucion_Compra int not null auto_increment unique,
Primary Key (ID_Devolucion_Compra),
ID_Detalle_Compra int not null,
Foreign Key (ID_Detalle_Compra) References Detalle_Compra (ID_Detalle_Compra),
Fecha_Devolucion Datetime not null,
Unidades_Devueltas int not null,
Costo_Devolucion_Unit Decimal (20,2) not null,
ID_Empleado int not null,
Foreign Key (ID_Empleado) References Empleado_Laboratorio(ID_Empleado),
Check(Unidades_Devueltas > 0),
Check(Costo_Devolucion_Unit > 0)
);

Create Table Venta(
ID_Venta int not null auto_increment primary key,
ID_Empleado int not null,
Cliente Varchar(50) not null,
Foreign Key (ID_Empleado) References Empleado_Laboratorio(ID_Empleado),
Fecha_Venta Datetime not null,
SubTotal_Vendido Decimal (20,2) not null,
Descuento float Default 0 not null,
ID_Tipo_Cambio int not null,
Foreign Key (ID_Tipo_Cambio) References Tipo_Cambio (ID_Tipo_Cambio),
Tipo_Moneda varchar (10) Default 'Córdobas' not null,
Modo_Venta varchar (10) Default 'Efectivo' not null,
Check(ModoVenta in ('Efectivo','Crédito')),
Check(SubTotal_Vendido > 0),
Check(Descuento >= 0),
Check(Tipo_Moneda in ('Córdobas','Dólares'))
);

Create Table Detalle_Venta(
ID_Detalle_Venta int not null auto_increment unique,
Primary Key (ID_Detalle_Venta),
ID_Venta int not null,
Foreign Key (ID_Venta) References Venta (ID_Venta),
ID_Producto int not null,
Foreign Key (ID_Producto) References Producto (ID_Producto),
Unidades_Vendidas int not null,
Precio_Venta Decimal (20,2) not null, 
Check(Unidades_Vendidas > 0),
Check(Precio_Venta > 0)
);

Create Table Inventario_General(
ID_Inventario_General int not null auto_increment unique,
Primary Key (ID_Inventario_General),
ID_Detalle_Compra int not null,
Foreign Key (ID_Detalle_Compra) References Detalle_Compra(ID_Detalle_Compra),
ID_Producto int not null,
Foreign Key (ID_Producto) References Producto (ID_Producto),
Fecha_Inventario Datetime not null,
Unidades_Inactivas int not null,
Costo_Unit Decimal (20,2) not null, 
ID_EmpleadoLaboratorio int not null,
Foreign Key (ID_EmpleadoLaboratorio) References Empleado_Laboratorio(ID_Empleado),
Check(Unidades_Inactivas > 0),
Check(Costo_Unit > 0)
);

/*-------------------------------------------------------------*/
/*	TABLAS DE MEDICO*/
/*--------------------------------------------------------------*/

Create Table Enfermera(
id_enfermera int auto_increment not null primary key,
id_enfermeraUsuario int unique not null,
foreign key (id_enfermeraUsuario)references Usuario(ID_Usuario),
primernombre varchar(50)not null,
segundonombre varchar(50),
primerapellido varchar(50)not null,
segundoapellido varchar(50),
cedula varchar(18)unique not null,
sexo_Enfermera varchar(25) not null,
Fecha_Contratacion date not null,
ID_Area Int not null,
Foreign Key (ID_Area) References Area_Trabajo (ID_Area),
ID_Cargo int not null, 
Foreign Key (ID_Cargo) References Cargo (ID_Cargo),
Direccion varchar(200)not null,
Estado boolean not null,
foto longblob,
Check(sexo_Enfermera in('Masculino','Femenino'))
);

Create Table Paciente(
id_paciente int primary key auto_increment not null,
id_pais int not null,
id_pacienteUsuario int unique not null,
foreign key (id_pacienteUsuario)references Usuario(ID_Usuario),
cedula varchar(20),
primerNombre varchar(50)not null,
segundoNombre varchar(50)not null,
primerApellido varchar(50)not null,
segundoApellido varchar(50)not null,
convencional varchar(15)not null,
celular varchar(15)not null,
edad int not null,
direccion varchar(500)not null,
menorEdad boolean default false,
estado boolean default true not null,
foreign key (id_pais)references Pais(id_pais),
check(edad>0),
check(cedula like '[0-9]''[0-9]''[0-9]''-''[0-9]''[0-9]''[0-9]''[0-9]''[0-9]''[0-9]''-''[0-9]''[0-9]''[0-9]''[0-9]''[A-Z]')
);

Create Table PacienteInterno(
id_paciente int primary key auto_increment not null,
id_enfermeraAsignada int not null,
id_pais int not null,
fecha_ingreso date not null,
fecha_salida date not null,
cedula varchar(20),
primerNombre varchar(50)not null,
segundoNombre varchar(50)not null,
primerApellido varchar(50)not null,
segundoApellido varchar(50)not null,
convencional varchar(15)not null,
celular varchar(15)not null,
edad int not null,
direccion varchar(500)not null,
menorEdad boolean default false,
estado boolean default true not null,
foreign key(id_enfermeraAsignada)references Enfermera(id_enfermera),
foreign key (id_pais)references Pais(id_pais),
check(edad>0),
check(cedula like '[0-9]''[0-9]''[0-9]''-''[0-9]''[0-9]''[0-9]''[0-9]''[0-9]''[0-9]''-''[0-9]''[0-9]''[0-9]''[0-9]''[A-Z]')
);

Create Table Enfermedades(
id_enfermedad int primary key auto_increment not null,
nombre_enfermedad varchar(300)not null,
fecha_registro date not null,
enfermedad_cronica boolean not null
);

Create Table Medico(
	id_medico int primary key auto_increment not null,
    id_medicoUsuario int unique not null,
	foreign key (id_medicoUsuario)references Usuario(ID_Usuario),
    primernombre varchar(50)not null,
    segundonombre varchar(50),
    primerapellido varchar(50)not null,
    segundoapellido varchar(50),
    cedula varchar(18)unique not null,
    sexo_Medico varchar(25) not null,
	Fecha_Contratacion date not null,
	ID_Area Int not null,
	Foreign Key (ID_Area) References Area_Trabajo (ID_Area),
ID_Cargo int not null, 
Foreign Key (ID_Cargo) References Cargo (ID_Cargo),
    Direccion varchar(200)not null,
    Estado boolean not null,
    foto longblob,
	Check(sexo_Medico in('Masculino','Femenino'))
);

Create Table Especialidad(
id_especialidad int primary key auto_increment not null,
id_medico int not null,
nombreEspecialidad varchar(200)not null,
foreign key(id_medico)references Medico(id_medico)
);

Create Table Cita(
id_cita int primary key auto_increment not null,
id_medico int not null,
id_paciente int not null,
fecha date not null,
hora varchar(25) not null,
estado boolean not null,
foreign key (id_medico)references Medico(id_medico),
foreign key (id_paciente)references Paciente(id_paciente)
);

Create Table Consulta(
id_consulta int primary key auto_increment not null,
id_cita int NOT NULL unique,
descripcion varchar(200)not null,
precio float,
foreign key(id_cita) references Cita(id_cita)
);

Create Table ExpedientePaciente(
id_historialPaciente int primary key auto_increment not null,
id_paciente int unique not null,
id_pacienteinterno int unique,
id_citasRealizadas int,
id_enfermedades int,
id_examenesRealizados int,
id_consultasRealizadas int,
fecha_registro datetime not null,
tipo_sangre varchar(4)not null,
estatura int not null,
peso double not null,
check(peso>0),
check(estatura>0),
check(tipo_sangre in('A+','A-','AB+','AB-','B+','B-','O+','O-')),
foreign key(id_enfermedades)references Enfermedades(id_enfermedad),
foreign key(id_citasRealizadas)references Cita(id_cita),
foreign key(id_paciente)references Paciente(id_paciente),
foreign key(id_pacienteinterno)references PacienteInterno(id_paciente)
);

Create Table Habitaciones(
id_habitacion int auto_increment Primary key,
ID_Area Int not null,
Numero_Camas int not null,
Estado boolean default true not null,
Foreign Key (ID_Area) References Area_Trabajo (ID_Area)
);

Create Table Cajero (
ID_cajero int not null auto_increment unique Primary Key,
ID_UsuarioCajero int unique not null,
foreign key(ID_UsuarioCajero) references Usuario(ID_Usuario),
Cedula_Cajero varchar (50) not null,
Sexo_Cajero varchar (10) not null,
ID_Cargo int not null, 
Foreign Key (ID_Cargo) References Cargo (ID_Cargo),
Salario decimal(20,2) not null,
Fecha_Contratacion date not null,
ID_Area Int not null,
Foreign Key (ID_Area) References Area_Trabajo (ID_Area),
Direccion varchar(200)not null,
Estado boolean not null,
foto longblob,
Check (Sexo_Cajero in ('Masculino', 'Femenino'))
);

Create Table FacturaConsulta(
id_factura int primary key auto_increment not null,
id_cajero int not null,
id_consulta int not null unique,
foreign key (id_consulta) references Consulta(id_consulta),
foreign key(id_cajero)references Cajero (Id_cajero),
numfactura int not null,
fecha time not null,
total float not null,
pago float not null,
cambio float not null
);

Create Table Detalle_Consulta(
id_detconsulta int primary key auto_increment not null,
id_consulta int unique not null,
foreign key(id_consulta)references Consulta(id_consulta),
altura varchar(20)not null,
peso varchar(20)not null
);

Create Table Diagnostico(
id_diagnostico int primary key auto_increment not null,
id_consulta int not null,
foreign key(id_consulta)references Consulta(id_consulta),
descripcion varchar(200)not null
);

Create Table DiasMedico(
	id_diaMedico int primary key auto_increment not null,
    id_Medico int unique not null,
    Lunes boolean not null,
	hora_entradaLUNES varchar(25) not null,
    hora_salidaLUNES varchar(25) not null,
    Martes boolean not null,
	hora_entradaMARTES varchar(25) not null,
    hora_salidaMARTES varchar(25) not null,
    Miercoles boolean not null,
	hora_entradaMIERCOLES varchar(25) not null,
    hora_salidaMIERCOLES varchar(25) not null,
    Jueves boolean not null,
	hora_entradaJUEVES varchar(25) not null,
    hora_salidaJUEVES varchar(25) not null,
    Viernes boolean not null,
	hora_entradaVIERNES varchar(25) not null,
    hora_salidaVIERNES varchar(25) not null,
    Sabado boolean not null,
	hora_entradaSABADO varchar(25) not null,
    hora_salidaSABADO varchar(25) not null,
    Domingo boolean not null,
	hora_entradaDOMINGO varchar(25) not null,
    hora_salidaDOMINGO varchar(25) not null,
	check(hora_entradaLUNES like '[0-9]''[0-9]'':''[0-9]''[0-9]'':''[0-9]''[0-9]'),
	check(hora_salidaLUNES like '[0-9]''[0-9]'':''[0-9]''[0-9]'':''[0-9]''[0-9]'),
	check(hora_entradaMARTES like '[0-9]''[0-9]'':''[0-9]''[0-9]'':''[0-9]''[0-9]'),
	check(hora_salidaMARTES like '[0-9]''[0-9]'':''[0-9]''[0-9]'':''[0-9]''[0-9]'),
	check(hora_entradaMIERCOLES like '[0-9]''[0-9]'':''[0-9]''[0-9]'':''[0-9]''[0-9]'),
	check(hora_salidaMIERCOLES like '[0-9]''[0-9]'':''[0-9]''[0-9]'':''[0-9]''[0-9]'),
	check(hora_entradaJUEVES like '[0-9]''[0-9]'':''[0-9]''[0-9]'':''[0-9]''[0-9]'),
	check(hora_salidaJUEVES like '[0-9]''[0-9]'':''[0-9]''[0-9]'':''[0-9]''[0-9]'),
	check(hora_entradaVIERNES like '[0-9]''[0-9]'':''[0-9]''[0-9]'':''[0-9]''[0-9]'),
	check(hora_salidaVIERNES like '[0-9]''[0-9]'':''[0-9]''[0-9]'':''[0-9]''[0-9]'),
	check(hora_entradaSABADO like '[0-9]''[0-9]'':''[0-9]''[0-9]'':''[0-9]''[0-9]'),
	check(hora_salidaSABADO like '[0-9]''[0-9]'':''[0-9]''[0-9]'':''[0-9]''[0-9]'),
	check(hora_entradaDOMINGO like '[0-9]''[0-9]'':''[0-9]''[0-9]'':''[0-9]''[0-9]'),
	check(hora_salidaDOMINGO like '[0-9]''[0-9]'':''[0-9]''[0-9]'':''[0-9]''[0-9]'),
    foreign key(id_Medico)references Medico(id_medico)
);

/*-------------------------------------------------------------*/
/*	TABLAS DE LOS DEPARTAMENTOS*/
/*--------------------------------------------------------------*/

Create Table HrsExtras (
ID_HrsExtras int not null auto_increment unique Primary Key,
ID_Medico Int not null,
Foreign Key (ID_Medico) References Medico(Id_medico),
ID_Cajero Int not null,
Foreign Key (ID_Cajero) References Cajero(Id_cajero),
ID_TrabajadorLaboratorio Int not null,
Foreign Key (ID_TrabajadorLaboratorio) References Empleado_Laboratorio(ID_Empleado),
HrsExtras int not null,
Fecha Date not null,
Estado_Hrs varchar (12) default 'No Cancelado' not null,
Check (Estado_Hrs in ('No Cancelado', 'Cancelado')),
Check (HrsExtras > 0)
);

Create Table Prestamo (
ID_Prestamo int not null auto_increment unique Primary Key,
ID_Medico Int not null,
Foreign Key (ID_Medico) References Medico(Id_medico),
ID_Cajero Int not null,
Foreign Key (ID_Cajero) References Cajero(Id_cajero),
ID_TrabajadorLaboratorio Int not null,
Foreign Key (ID_TrabajadorLaboratorio) References Empleado_Laboratorio(ID_Empleado),
Prestamo decimal(20,2) not null,
Fecha Date not null,
Estado_Prestamo varchar (12) default 'No Cancelado' not null,
Check (Estado_Prestamo in ('No Cancelado', 'Cancelado')),
Check (Prestamo > 0)
);

Create Table Nomina (
ID_Nomina int not null auto_increment unique Primary Key,
No_Nomina Int not null,
FechaNomina Date not null,
ID_Medico Int not null,
Foreign Key (ID_Medico) References Medico(Id_medico),
ID_Cajero Int not null,
Foreign Key (ID_Cajero) References Cajero(Id_cajero),
ID_TrabajadorLaboratorio Int not null,
Foreign Key (ID_TrabajadorLaboratorio) References Empleado_Laboratorio (ID_Empleado),
SalarioBasico decimal(20,2) not null,
Cantidad_HrsExtras int not null,
Pago_HrsExtras decimal(20,2) not null,
AniosAntiguedad int not null,
Antiguedad decimal(20,2) not null,
TotalIngresos decimal(20,2) not null,
INSS_L decimal(20,2) not null,
IR decimal(20,2) not null,
TotalDeducciones decimal(20,2) not null,
SalarioNeto decimal(20,2) not null,
OtrasDeducciones decimal(20,2) not null,
SalarioPagar decimal(20,2) not null,
INSS_P decimal(20,2) not null,
INATEC decimal(20,2) not null,
Vacaciones decimal(20,2) not null,
TreceavoMes decimal(20,2) not null,
Estado_Nomina varchar (12) default 'No Cancelado' not null,
Check (Estado_Nomina in ('No Cancelado', 'Cancelado')),
Check (SalarioBasico > 0),
Check (Cantidad_HrsExtras >= 0),
Check (Pago_HrsExtras >= 0),
Check (Antiguedad >= 0),
Check (TotalIngresos >= 0),
Check (INSS_L >= 0),
Check (IR >= 0),
Check (TotalDeducciones >= 0),
Check (SalarioNeto >= 0),
Check (OtrasDeducciones >= 0),
Check (SalarioPagar >= 0),
Check (INSS_P >= 0),
Check (INATEC >= 0),
Check (Vacaciones >= 0),
Check (TreceavoMes >= 0)
);

delimiter |
Create Trigger Disminuir_Inventario
after Insert on Detalle_Venta
For Each Row
Begin

Set @Unids = New.Unidades_Vendidas;

While (@Unids > 0) Do

Set @UnidadesDis = (Select Unids_Disponibles from detalle_compra
where (ID_Producto = new.ID_Producto)
and (Unids_Disponibles > 0) limit 1);

-- Select @UnidadesDis;

if(@UnidadesDis >= @Unids) then
Set @UnidsTotal = @UnidadesDis - @Unids;
Set @Unids = 0;
/*Select 'Entro en 1';
Select @UnidsTotal;*/
end if;

if(@Unids > @UnidadesDis) then
Set @UnidsTotal = 0;
Set @Unids = @Unids - @UnidadesDis;
/*Select 'Entro en 2';
Select @Unids;*/
End if;

Update detalle_compra
Set Unids_Disponibles = @UnidsTotal
where (ID_Producto = New.ID_Producto)
and (Unids_Disponibles > 0) limit 1;

End While;

End;
|
delimiter ;