--TABLAS PARA EL BLOQUE 3

CREATE TABLE DEPART (
   DEPTNO  NUMBER(2) NOT NULL,
   DNOMBRE  VARCHAR2(14),
   LOC      VARCHAR2(14),
   PRIMARY KEY (DEPTNO) );




CREATE TABLE EMPLE (
  EMPNO    NUMBER(4) NOT NULL,
  APELLIDO  VARCHAR2(10),
  OFICIO    VARCHAR2(10),
  DIR       NUMBER(4) ,
  FECHAALT DATE      ,
  SALARIO   NUMBER(10),
  COMISION  NUMBER(10),
  DEPTNO   NUMBER(2) NOT NULL,
 CONSTRAINT PK_EMP_NO PRIMARY KEY (EMPNO) );



INSERT INTO DEPART VALUES (10,'CONTABILIDAD','SEVILLA');
  INSERT INTO DEPART VALUES (20,'INVESTIGACION','MADRID');
  INSERT INTO DEPART VALUES (30,'VENTAS','BARCELONA');
  INSERT INTO DEPART VALUES (40,'PRODUCCION','BILBAO');



INSERT INTO EMPLE VALUES (7369,'SANCHEZ','EMPLEADO',7902,'17/12/1980',104000,NULL,20);
INSERT INTO EMPLE VALUES (7499,'ARROYO','VENDEDOR',7698,'20/02/1980', 208000,39000,30);
INSERT INTO EMPLE VALUES (7521,'SALA','VENDEDOR',7698,'22/02/1981', 162500,65000,30);
INSERT INTO EMPLE VALUES (7566,'JIMENEZ','DIRECTOR',7839,'02/04/1981', 386750,NULL,20);
INSERT INTO EMPLE VALUES (7654,'MARTIN','VENDEDOR',7698,'29/09/1981', 162500,182000,30);
INSERT INTO EMPLE VALUES (7698,'NEGRO','DIRECTOR',7839,'01/05/1981', 370500,NULL,30);
INSERT INTO EMPLE VALUES (7782,'CEREZO','DIRECTOR',7839,'09/06/1981', 318500,NULL,10);
INSERT INTO EMPLE VALUES (7788,'GIL','ANALISTA',7566,'09/11/1981', 390000,NULL,20);
INSERT INTO EMPLE VALUES (7839,'REY','PRESIDENTE',NULL,'17/11/1981', 650000,NULL,10);
INSERT INTO EMPLE VALUES (7844,'TOVAR','VENDEDOR',7698,'08/09/1981', 195000,0,30);
INSERT INTO EMPLE VALUES (7876,'ALONSO','EMPLEADO',7788,'23/09/1981', 143000,NULL,20);
INSERT INTO EMPLE VALUES (7900,'JIMENO','EMPLEADO',7698,'03/12/1981', 123500,NULL,30);
INSERT INTO EMPLE VALUES (7902,'FERNANDEZ','ANALISTA',7566,'03/12/1981',390000, NULL,20);

-- TABLAS PARA EL BLOQUE 2

drop table clientes;
CREATE TABLE clientes (
	Num_clie 		integer not null PRIMARY KEY, 
	Empresa		char (20 ) not null,
	Repclie		integer,
	Limite_credito 	numeric
);

INSERT INTO clientes VALUES (2101, 'Jones Mfg.',106, 65000);
INSERT INTO clientes VALUES (2102, 'First Corp. ',101, 65000);
INSERT INTO clientes VALUES (2103, 'Acme Mfg.',105, 50000);
INSERT INTO clientes VALUES (2105, 'AAA Investments',101, 45000);
INSERT INTO clientes VALUES (2106, 'Fred Lewis Corp.',102, 65000);
INSERT INTO clientes VALUES (2107, 'Ace International',110, 35000);
INSERT INTO clientes VALUES (2108, 'Holm Landis',109, 55000);
INSERT INTO clientes VALUES (2109, 'Chen Associates',103, 25000);
INSERT INTO clientes VALUES (2111, 'JCP  Inc. ',103, 50000);
INSERT INTO clientes VALUES (2112, 'Zetacorp',108, 50000);
INSERT INTO clientes VALUES (2113, 'Ian Smith',104, 20000);
INSERT INTO clientes VALUES (2114, 'Orion Corp.',102, 20000);
INSERT INTO clientes VALUES (2115, 'Smithson Corp.',101, 20000);
INSERT INTO clientes VALUES (2117, 'J. P. Sinclair',106, 35000);
INSERT INTO clientes VALUES (2118, 'Midwest Systems',108, 60000);
INSERT INTO clientes VALUES (2119, 'Solomon Inc.',109, 25000);
INSERT INTO clientes VALUES (2120, 'Rico Enterprises',102, 50000);
INSERT INTO clientes VALUES (2121, 'QMA Assoc.',103, 45000);
INSERT INTO clientes VALUES (2122, 'Three-Way Lines',105, 30000);
INSERT INTO clientes VALUES (2123, 'Carter Sons',102, 40000);
INSERT INTO clientes VALUES (2124, 'Peter Brothers',107, 40000);

Drop table repventas;
CREATE TABLE repventas (
	Num_emple 		integer not null PRIMARY KEY, 
	Name 			char (15) not null,
	Edad 			integer,
	Oficina_rep		integer,
	Titulo 			char (10),
	Contrato		date not null,
	Director		integer,
	Cuota			numeric,
	Ventas			numeric not null
);

INSERT INTO repventas VALUES (101,'Dan Roberts', 45, 12, 'Rep Ventas', '20-10-2000', 104, 300000, 305673);
INSERT INTO repventas VALUES (102,'Sue Smith', 48, 21, 'Rep Ventas', '12-12-2000', 108, 350000, 474050);
INSERT INTO repventas VALUES (103,'Paul Cruz', 29, 12, 'Rep Ventas', '01-03-2001', 104, 275000, 286775);
INSERT INTO repventas VALUES (104, 'Bob Smith', 33, 12, 'Dir Ventas', '19-05-2001', 106, 200000, 142594);
INSERT INTO repventas VALUES (105, 'Bill Adams', 37, 13, 'Rep Ventas', '12-02-2002', 104, 350000, 367911);
INSERT INTO repventas VALUES (106,'Sam Clark', 52, 11, 'VP Ventas', '14-06-2002', null, 275000, 299912);
INSERT INTO repventas VALUES (107,'Nancy Angelli', 49, 22, 'Rep Ventas', '14-11-2002', 108, 300000, 186042);
INSERT INTO repventas VALUES (108,'Larry Fitch', 62, 21, 'Dir Ventas', '12-10-2003', 106, 350000, 361865);
INSERT INTO repventas VALUES (109,'Mary Jones', 31, 11, 'Rep Ventas', '12-10-2003', 101, 300000, 392725);
INSERT INTO repventas VALUES (110,'Tom Snyder', 41, null, 'Rep Ventas', '13-01-2004', 101, null, 75985);

Drop table oficinas;
CREATE TABLE oficinas (
	Oficina 		integer not null PRIMARY KEY, 
	Ciudad			char (15) not null,
	Region			char(10) not null,
	Dir			integer REFERENCES repventas (Num_emple),
	Objetivo		number,
	Ventas			number not null
);

INSERT INTO oficinas VALUES (11,'New York','Este', 106, 575000, 692637);
INSERT INTO oficinas VALUES (12,'Chicago','Este', 104, 800000, 735042);
INSERT INTO oficinas VALUES (13,'Atlanta','Este', 105, 350000, 367911);
INSERT INTO oficinas VALUES (21,'Los Angeles','Oeste', 108, 725000, 835915);
INSERT INTO oficinas VALUES (22,'Denver','Oeste', 108, 300000, 186042);

Drop table productos;
CREATE TABLE productos (
	Id_fab			char(3) not null,
	Id_producto		char(5) not null,
	Descripcion		char (20) not null,
	Precio			number not null,
	Existencias		integer not null,
	CONSTRAINT productos_id_fab_id_prod 
PRIMARY KEY (Id_fab, Id_producto)
);

INSERT INTO productos VALUES ('ACI','41001','Articulo Tipo 1', 55, 277);
INSERT INTO productos VALUES ('ACI','41002','Articulo Tipo 2', 76, 167);
INSERT INTO productos VALUES ('ACI','41003','Articulo Tipo 3', 107, 207);
INSERT INTO productos VALUES ('ACI','41004','Articulo Tipo 4', 117, 139);
INSERT INTO productos VALUES ('ACI','4100X','Ajustador', 25, 37);
INSERT INTO productos VALUES ('ACI','4100Y','Extractor', 2750, 25);
INSERT INTO productos VALUES ('ACI','4100Z','Montador', 2500, 28);
INSERT INTO productos VALUES ('BIC','41003','Manivela ', 652, 3);
INSERT INTO productos VALUES ('BIC','41089','Retn', 225, 78);
INSERT INTO productos VALUES ('BIC','41672','Plate', 180, 0);
INSERT INTO productos VALUES ('FEA','112','Cubierta1', 148, 115);
INSERT INTO productos VALUES ('FEA','114','Bancada Motor', 243, 15);
INSERT INTO productos VALUES ('IMM','773C','Riostra ½ Tm', 975, 28);
INSERT INTO productos VALUES ('IMM','775C','Riostra 1-Tm', 1425, 5);
INSERT INTO productos VALUES ('IMM','779C','Riostra 2- Tm', 1875, 9);
INSERT INTO productos VALUES ('IMM','887H','Soporte Riostra', 54, 223);
INSERT INTO productos VALUES ('IMM','887P','Perno Riostra', 250, 24);
INSERT INTO productos VALUES ('IMM','887X','Retenedor Riostra', 475, 32);
INSERT INTO productos VALUES ('QSA','XK47','Reductor ', 355, 38);
INSERT INTO productos VALUES ('QSA','XK48','Reductor', 134, 203);
INSERT INTO productos VALUES ('QSA','XK48A','Reductor', 117, 37);
INSERT INTO productos VALUES ('REI','2A44G','Pasador Bisagra', 350, 14);
INSERT INTO productos VALUES ('REI','2A44L','Bisagra Izda.', 4500, 12);
INSERT INTO productos VALUES ('REI','2A44R','Bisagra Dcha.', 4500, 12);
INSERT INTO productos VALUES ('REI','2A45C','V Stago Trinquete', 79, 210);

Drop table pedidos;
CREATE TABLE pedidos (
	Num_pedido		integer  not null PRIMARY KEY,
	Fecha_pedido		date not null,
	Clie			integer not null REFERENCES clientes (Num_clie),
	Rep			integer REFERENCES repventas (Num_emple),
	Fab 			char(3) not null,
	Producto		char(5) not null,
	Cant			integer not null,
	Importe		number not null
);

INSERT INTO pedidos VALUES ( 110036, ' 30-01-2004 ', 2107, 110, 'ACI', '4100Z', 9, 22500);
INSERT INTO pedidos VALUES ( 112961, ' 17-12-2003 ', 2117, 106, 'REI', '2A44L', 7, 31500);
INSERT INTO pedidos VALUES ( 112963, ' 17-12-2003 ', 2103, 105, 'ACI', '41004', 28, 3276);
INSERT INTO pedidos VALUES ( 112968, ' 12-10-2003 ', 2102, 101, 'ACI', '41004', 34, 3978);
INSERT INTO pedidos VALUES ( 112975, ' 12-10-2003 ', 2111, 103, 'REI', '2A44G', 6, 2100);
INSERT INTO pedidos VALUES ( 112979, ' 12-10-2003 ', 2114, 102, 'ACI', '4100Z', 6, 15000);
INSERT INTO pedidos VALUES ( 112983, ' 27-12-2003 ', 2103, 105, 'ACI', '41004', 6, 702);
INSERT INTO pedidos VALUES ( 112987, ' 31-12-2003 ', 2103, 105, 'ACI', '4100Y', 11, 27500);
INSERT INTO pedidos VALUES ( 112989, ' 03-01-2004 ', 2101, 106, 'FEA', '114', 6, 14580);
INSERT INTO pedidos VALUES ( 112992, ' 04-11-2003 ', 2118, 108, 'ACI', '41002', 10, 760);
INSERT INTO pedidos VALUES ( 112993, ' 04-01-2003 ', 2106, 102, 'REI', '2A45C', 24, 1896);
INSERT INTO pedidos VALUES ( 112997, ' 08-01-2004 ', 2124, 107, 'BIC', '41003', 1, 652);
INSERT INTO pedidos VALUES ( 113003, ' 25-01-2004 ', 2108, 109, 'IMM', '779C', 3, 5625);
INSERT INTO pedidos VALUES ( 113007, ' 08-01-2004 ', 2112, 108, 'IMM', '773C', 3, 2925);
INSERT INTO pedidos VALUES ( 113012, ' 11-01-2004 ', 2111, 105, 'ACI', '41003', 35, 3745);
INSERT INTO pedidos VALUES ( 113013, ' 14-01-2004 ', 2118, 108, 'BIC', '41003', 1, 652);
INSERT INTO pedidos VALUES ( 113024, ' 20-01-2004 ', 2114, 108, 'QSA', 'XK47', 20, 7100);
INSERT INTO pedidos VALUES ( 113027, ' 22-01-2004 ', 2103, 105, 'ACI', '41002', 54, 4104);
INSERT INTO pedidos VALUES ( 113034, ' 29-01-2004 ', 2107, 110, 'REI', '2A45C', 8, 632);
INSERT INTO pedidos VALUES ( 113042, ' 02-02-2004 ', 2113, 101, 'REI', '2A44R', 5, 22500);
INSERT INTO pedidos VALUES ( 113045, ' 02-02-2004 ', 2112, 108, 'REI', '2A44R', 10, 45000);
INSERT INTO pedidos VALUES ( 113048, ' 10-02-2004 ', 2120, 102, 'IMM', '779C', 2, 3750);
INSERT INTO pedidos VALUES ( 113049, ' 10-02-2004 ', 2118, 108, 'QSA', 'XK47', 6, 2130);
INSERT INTO pedidos VALUES ( 113051, ' 10-02-2004 ', 2118, 108, 'QSA', 'XK47', 4, 1420);
INSERT INTO pedidos VALUES ( 113055, ' 15-02-2004 ', 2108, 101, 'ACI', '4100X', 6, 150);
INSERT INTO pedidos VALUES ( 113057, ' 18-02-2004 ', 2111, 103, 'ACI', '4100X', 24, 600);
INSERT INTO pedidos VALUES ( 113058, ' 23-02-2004 ', 2108, 109, 'FEA', '112', 10, 1480);
INSERT INTO pedidos VALUES ( 113062, ' 24-02-2004', 2124, 102, 'FEA', '114', 10, 2430);
INSERT INTO pedidos VALUES ( 113065, ' 27-02-2004 ', 2106, 109, 'QSA', 'XK47', 6, 2130);
INSERT INTO pedidos VALUES ( 113069, ' 02-03-2004 ', 2109, 107, 'IMM', '775C', 22, 31350);

commit;