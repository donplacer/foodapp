use fudtec;



/*insertamos las categorias*/
/*id, nombre_categoria*/
insert into categoria values(1,"postres");
insert into categoria values(2,"entradas");
insert into categoria values(3,"segundos");



/*insertamos las comidas*/
insert into comida (id, nombre, descripcion, precio, categoria_id) values(1,"chaufita","rico chaufa de la tia veneno",10.0,3);
insert into comida (id, nombre, descripcion, precio, categoria_id) values(2,"gelatina","rica gelatina",1.50,1);
insert into comida (id, nombre, descripcion, precio, categoria_id) values(3,"huancayna","rica huancayna",3.5,2);
insert into comida (id, nombre, descripcion, precio, categoria_id) values(4,"lomo saltado","delicioso lomo saltado",12.5,3);



/*insertamos mesas*/
insert into mesa values(1,"mesa 1");
insert into mesa values(2,"mesa 2");
insert into mesa values(3,"mesa 3");
insert into mesa values(4,"mesa 4");


/*insertamos tipos de cuenta*/
insert into tipo_cuenta(id, nombre) values(1,"administrador");
insert into tipo_cuenta(id, nombre) values(2,"mozo");



/*insertamos cuentas*/
insert into cuenta(id, usuario, password, tipo_id) values(1,"usuario","password",2)
insert into cuenta(id, usuario, password, tipo_id) values(2,"tresdiez","loki",2)
insert into cuenta(id, usuario, password, tipo_id) values(3,"admin","admin",1)
insert into cuenta(id, usuario, password, tipo_id) values(4,"mozo","mozo",2)



/*insertamos empleados*/
insert into empleado(id, apellido, nombre, cuenta_id) values(1, "perez", "juan", 1)
insert into empleado(id, apellido, nombre, cuenta_id) values(2, "peroa", "jose", 2)
insert into empleado(id, apellido, nombre, cuenta_id) values(3, "solano", "maria", 3)
insert into empleado(id, apellido, nombre, cuenta_id) values(4, "avestru", "jorge", 4)




/*insertamos pedidos o ventas*/

insert into venta(id, estado, fecha_venta, empleado_id, mesa_id) values(1, "pagado", '1995-01-29', 1,1);
insert into venta(id, estado, fecha_venta, empleado_id, mesa_id) values(2, "pendiente",'1995-01-29', 2,3);
insert into venta(id, estado, fecha_venta, empleado_id, mesa_id) values(3, "pagado",'1995-01-29', 4,2);
insert into venta(id, estado, fecha_venta, empleado_id, mesa_id) values(4, "pagado", '1995-01-29', 1,1);
insert into venta(id, estado, fecha_venta, empleado_id, mesa_id) values(5, "pagado", '1995-01-29', 2,4);


/*insertamos el detalle venta*/

insert into venta_comida (venta_id, comida_id, cantidad) values(1,4,1);

insert into venta_comida(venta_id, comida_id, cantidad) values(1,1,1);
insert into venta_comida(venta_id, comida_id, cantidad) values(1,2,1);
insert into venta_comida(venta_id, comida_id, cantidad) values(2,4,1);
insert into venta_comida(venta_id, comida_id, cantidad) values(3,5,1);

insert into venta_comida(venta_id, comida_id, cantidad) values(4,2,1);
insert into venta_comida(venta_id, comida_id, cantidad) values(5,3,1);
insert into venta_comida(venta_id, comida_id, cantidad) values(5,4,1);




