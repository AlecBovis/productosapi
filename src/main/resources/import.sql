INSERT INTO productos(id_producto ,pro_name) VALUES(1,'Formatos');
INSERT INTO productos(id_producto ,pro_name) VALUES(2,'Recibos');
INSERT INTO productos(id_producto ,pro_name) VALUES(3,'Tarjetas');
INSERT INTO productos(id_producto ,pro_name) VALUES(4,'Formularios');
INSERT INTO productos(id_producto ,pro_name) VALUES(5,'Examenes');
INSERT INTO productos(id_producto ,pro_name) VALUES(6,'Folletos');

INSERT INTO personas(id_persona ,per_apellido ,per_cargo ,per_dni ,per_nombre ,per_telefono) VALUES(1,'González','Conductor','98745632','Antonio','987451236');
INSERT INTO personas(id_persona ,per_apellido ,per_cargo ,per_dni ,per_nombre ,per_telefono) VALUES(2,'Rodríguez','Ayudante','98745632','Jose','987451236');
INSERT INTO personas(id_persona ,per_apellido ,per_cargo ,per_dni ,per_nombre ,per_telefono) VALUES(3,'Gómez','Conductor','98745632','Manuel','987451236');
INSERT INTO personas(id_persona ,per_apellido ,per_cargo ,per_dni ,per_nombre ,per_telefono) VALUES(4,'Fernández','Ayudante','98745632','Francisco','987451236');
INSERT INTO personas(id_persona ,per_apellido ,per_cargo ,per_dni ,per_nombre ,per_telefono) VALUES(5,'López','Conductor','98745632','David','987451236');
INSERT INTO personas(id_persona ,per_apellido ,per_cargo ,per_dni ,per_nombre ,per_telefono) VALUES(6,'Díaz','Ayudante','98745632','Juan','987451236');
INSERT INTO personas(id_persona ,per_apellido ,per_cargo ,per_dni ,per_nombre ,per_telefono) VALUES(7,'Martínez','Conductor','98745632','Daniel','987451236');
INSERT INTO personas(id_persona ,per_apellido ,per_cargo ,per_dni ,per_nombre ,per_telefono) VALUES(8,'Pérez','Ayudante','98745632','Antonio ','987451236');

INSERT INTO clientes(id_cliente ,cli_correo ,cli_descripcion ,cli_direccion ,cli_telefono) VALUES(1,'rimac@gmail.com','Rimac','San Isidro','987451426');
INSERT INTO clientes(id_cliente ,cli_correo ,cli_descripcion ,cli_direccion ,cli_telefono) VALUES(2,'reniec@gmail.com','RENIEC','Santa Anita','987451426');
INSERT INTO clientes(id_cliente ,cli_correo ,cli_descripcion ,cli_direccion ,cli_telefono) VALUES(3,'bcp@gmail.com','BCP','La Molina','987451426');
INSERT INTO clientes(id_cliente ,cli_correo ,cli_descripcion ,cli_direccion ,cli_telefono) VALUES(4,'bbva@gmail.com','BBVA','San Miguel','987451426');
INSERT INTO clientes(id_cliente ,cli_correo ,cli_descripcion ,cli_direccion ,cli_telefono) VALUES(5,'prosegur@gmail.com','Prosegur','Surco','987451426');
INSERT INTO clientes(id_cliente ,cli_correo ,cli_descripcion ,cli_direccion ,cli_telefono) VALUES(6,'luzdelsur@gmail.com','LuzdelSur','Miraflores','987451426');

INSERT INTO vehiculos(id_vehiculo ,ve_placa ,ayudante_id_personas ,conductor_id_personas) VALUES(1,'PLE9945',2,1);
INSERT INTO vehiculos(id_vehiculo ,ve_placa ,ayudante_id_personas ,conductor_id_personas) VALUES(2,'PMK7754',4,3);
INSERT INTO vehiculos(id_vehiculo ,ve_placa ,ayudante_id_personas ,conductor_id_personas) VALUES(3,'GGN3426',6,5);
INSERT INTO vehiculos(id_vehiculo ,ve_placa ,ayudante_id_personas ,conductor_id_personas) VALUES(4,'PFM5794',8,7);

INSERT INTO hojaderutas(id_hojade_rutas ,hr_bultos ,hr_fecha ,hr_numguia ,hr_numpedido ,hr_peso ,hr_secuencia ,hr_tipo ,cliente_id_cliente ,producto_id_producto ,vehiculo_id_vehiculo) VALUES(1,3,'2019-12-14','012-0015526',371277,15,1,'despacho',2,5,2);
INSERT INTO hojaderutas(id_hojade_rutas ,hr_bultos ,hr_fecha ,hr_numguia ,hr_numpedido ,hr_peso ,hr_secuencia ,hr_tipo ,cliente_id_cliente ,producto_id_producto ,vehiculo_id_vehiculo) VALUES(2,9,'2019-12-12','006-0352508',37121137,75,1,'despacho',1,6,2);
INSERT INTO hojaderutas(id_hojade_rutas ,hr_bultos ,hr_fecha ,hr_numguia ,hr_numpedido ,hr_peso ,hr_secuencia ,hr_tipo ,cliente_id_cliente ,producto_id_producto ,vehiculo_id_vehiculo) VALUES(3,1,'2019-12-11','012-0011523',369289,2,1,'despacho',5,4,1);
INSERT INTO hojaderutas(id_hojade_rutas ,hr_bultos ,hr_fecha ,hr_numguia ,hr_numpedido ,hr_peso ,hr_secuencia ,hr_tipo ,cliente_id_cliente ,producto_id_producto ,vehiculo_id_vehiculo) VALUES(4,21,'2019-12-15','352512-352515',371454,125,2,'despacho',3,2,3);
