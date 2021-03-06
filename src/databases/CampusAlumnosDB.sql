USE [bdSistema]
GO
/****** Object:  StoredProcedure [dbo].[CampusInsertar]    Script Date: 11/17/2021 2:55:32 PM ******/
DROP PROCEDURE [dbo].[CampusInsertar]
GO
/****** Object:  StoredProcedure [dbo].[AlumnosInsertar]    Script Date: 11/17/2021 2:55:32 PM ******/
DROP PROCEDURE [dbo].[AlumnosInsertar]
GO
/****** Object:  StoredProcedure [dbo].[AlumnosGetSelect]    Script Date: 11/17/2021 2:55:32 PM ******/
DROP PROCEDURE [dbo].[AlumnosGetSelect]
GO
/****** Object:  StoredProcedure [dbo].[AlumnosDesactivar]    Script Date: 11/17/2021 2:55:32 PM ******/
DROP PROCEDURE [dbo].[AlumnosDesactivar]
GO
/****** Object:  StoredProcedure [dbo].[AlumnosActualizar]    Script Date: 11/17/2021 2:55:32 PM ******/
DROP PROCEDURE [dbo].[AlumnosActualizar]
GO
/****** Object:  StoredProcedure [dbo].[AlumnosActiveGetSelect]    Script Date: 11/17/2021 2:55:32 PM ******/
DROP PROCEDURE [dbo].[AlumnosActiveGetSelect]
GO
ALTER TABLE [dbo].[Alumnos] DROP CONSTRAINT [FK_Alumnos_Campus]
GO
/****** Object:  Table [dbo].[Campus]    Script Date: 11/17/2021 2:55:32 PM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Campus]') AND type in (N'U'))
DROP TABLE [dbo].[Campus]
GO
/****** Object:  Table [dbo].[Alumnos]    Script Date: 11/17/2021 2:55:32 PM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Alumnos]') AND type in (N'U'))
DROP TABLE [dbo].[Alumnos]
GO
/****** Object:  User [magdiel]    Script Date: 11/17/2021 2:55:32 PM ******/
DROP USER [magdiel]
GO
USE [master]
GO
/****** Object:  Database [bdSistema]    Script Date: 11/17/2021 2:55:32 PM ******/
DROP DATABASE [bdSistema]
GO
/****** Object:  Database [bdSistema]    Script Date: 11/17/2021 2:55:32 PM ******/

CREATE DATABASE [bdSistema]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'bdSistema', FILENAME = N'/var/opt/mssql/data/bdSistema.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'bdSistema_log', FILENAME = N'/var/opt/mssql/data/bdSistema_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [bdSistema] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [bdSistema].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [bdSistema] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [bdSistema] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [bdSistema] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [bdSistema] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [bdSistema] SET ARITHABORT OFF 
GO
ALTER DATABASE [bdSistema] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [bdSistema] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [bdSistema] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [bdSistema] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [bdSistema] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [bdSistema] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [bdSistema] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [bdSistema] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [bdSistema] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [bdSistema] SET  DISABLE_BROKER 
GO
ALTER DATABASE [bdSistema] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [bdSistema] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [bdSistema] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [bdSistema] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [bdSistema] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [bdSistema] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [bdSistema] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [bdSistema] SET RECOVERY FULL 
GO
ALTER DATABASE [bdSistema] SET  MULTI_USER 
GO
ALTER DATABASE [bdSistema] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [bdSistema] SET DB_CHAINING OFF 
GO
ALTER DATABASE [bdSistema] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [bdSistema] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [bdSistema] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [bdSistema] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'bdSistema', N'ON'
GO
ALTER DATABASE [bdSistema] SET QUERY_STORE = OFF
GO
USE [bdSistema]
GO
/****** Object:  User [magdiel]    Script Date: 11/17/2021 2:55:32 PM ******/
CREATE USER [magdiel] FOR LOGIN [magdiel] WITH DEFAULT_SCHEMA=[dbo]
GO
/****** Object:  Table [dbo].[Alumnos]    Script Date: 11/17/2021 2:55:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Alumnos](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[nombre] [varchar](50) NOT NULL,
	[campusId] [int] NOT NULL,
	[fechaCreacion] [datetime] NOT NULL,
	[estatus] [bit] NOT NULL,
 CONSTRAINT [PK_Alumnos] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Campus]    Script Date: 11/17/2021 2:55:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Campus](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[nombre] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Campus] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Alumnos] ON 

INSERT [dbo].[Alumnos] ([id], [nombre], [campusId], [fechaCreacion], [estatus]) VALUES (1, N'Magdiel', 1, CAST(N'2021-11-17T21:32:23.540' AS DateTime), 1)
INSERT [dbo].[Alumnos] ([id], [nombre], [campusId], [fechaCreacion], [estatus]) VALUES (2, N'Sergio', 3, CAST(N'2021-11-17T21:32:32.120' AS DateTime), 1)
INSERT [dbo].[Alumnos] ([id], [nombre], [campusId], [fechaCreacion], [estatus]) VALUES (3, N'Cesar', 2, CAST(N'2021-11-17T21:32:38.847' AS DateTime), 1)
INSERT [dbo].[Alumnos] ([id], [nombre], [campusId], [fechaCreacion], [estatus]) VALUES (5, N'Fernando', 5, CAST(N'2021-11-17T21:43:50.833' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[Alumnos] OFF
GO
SET IDENTITY_INSERT [dbo].[Campus] ON 

INSERT [dbo].[Campus] ([id], [nombre]) VALUES (1, N'Universidad de Wisconsin')
INSERT [dbo].[Campus] ([id], [nombre]) VALUES (2, N'Colegio Swarthmore')
INSERT [dbo].[Campus] ([id], [nombre]) VALUES (3, N'Universidad Estatal de Appalachian')
INSERT [dbo].[Campus] ([id], [nombre]) VALUES (4, N'Universidad de Chicago')
INSERT [dbo].[Campus] ([id], [nombre]) VALUES (5, N'Universidad Wake Forest')
INSERT [dbo].[Campus] ([id], [nombre]) VALUES (6, N'Universidad de Nostre Dame')
INSERT [dbo].[Campus] ([id], [nombre]) VALUES (7, N'Universidad de California en Santa Cruz')
INSERT [dbo].[Campus] ([id], [nombre]) VALUES (8, N'Universidad de Colorado en Boulder')
INSERT [dbo].[Campus] ([id], [nombre]) VALUES (9, N'Universidad de Elon')
INSERT [dbo].[Campus] ([id], [nombre]) VALUES (10, N'Universidad de Harvard')
SET IDENTITY_INSERT [dbo].[Campus] OFF
GO
ALTER TABLE [dbo].[Alumnos]  WITH CHECK ADD  CONSTRAINT [FK_Alumnos_Campus] FOREIGN KEY([campusId])
REFERENCES [dbo].[Campus] ([id])
GO
ALTER TABLE [dbo].[Alumnos] CHECK CONSTRAINT [FK_Alumnos_Campus]
GO
/****** Object:  StoredProcedure [dbo].[AlumnosActiveGetSelect]    Script Date: 11/17/2021 2:55:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create Procedure [dbo].[AlumnosActiveGetSelect]
As
Begin
	Select A.id 'Id', A.nombre 'Nombre', A.fechaCreacion 'Fecha', A.estatus 'Estatus', C.id 'Id Campus', C.nombre 'Nombre Campus'
	From Alumnos A
	Inner Join Campus C On A.campusId = C.id
	Where estatus = 1
End
GO
/****** Object:  StoredProcedure [dbo].[AlumnosActualizar]    Script Date: 11/17/2021 2:55:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create Procedure [dbo].[AlumnosActualizar]
@id int,
@nombre varchar(50),
@campusId int,
@estatus bit
As
Begin
	Update Alumnos
	Set nombre = @nombre,
		campusId = @campusId,
		fechaCreacion = getDate(),
		estatus = @estatus
	Where id = @id
End
GO
/****** Object:  StoredProcedure [dbo].[AlumnosDesactivar]    Script Date: 11/17/2021 2:55:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create Procedure [dbo].[AlumnosDesactivar]
@id int
As
Begin
	Update Alumnos
	Set estatus = 0
	Where id = @id
End
GO
/****** Object:  StoredProcedure [dbo].[AlumnosGetSelect]    Script Date: 11/17/2021 2:55:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create Procedure [dbo].[AlumnosGetSelect]
As
Begin
	Select A.id 'Id', nombre 'Nombre', A.fechaCreacion 'Fecha', A.estatus 'Estatus', C.id 'Id Campus', C.nombre 'Nombre Campus'
	From Alumnos A
	Inner Join Campus C On A.campusId = C.id
End
GO
/****** Object:  StoredProcedure [dbo].[AlumnosInsertar]    Script Date: 11/17/2021 2:55:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create Procedure [dbo].[AlumnosInsertar]
@nombre varchar(50),
@campusId int,
@estatus bit
As
Begin
	Insert Into Alumnos (nombre, campusId, fechaCreacion, estatus)
	Values (@nombre, @campusId, getDate(), @estatus)
End
GO
/****** Object:  StoredProcedure [dbo].[CampusInsertar]    Script Date: 11/17/2021 2:55:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create Procedure [dbo].[CampusInsertar]
@nombre varchar(50)
As
Begin
	Insert Into Campus (nombre)
	Values (@nombre)
End
GO
USE [master]
GO
ALTER DATABASE [bdSistema] SET  READ_WRITE 
GO

--exec dbo.CampusInsertar 'UAdeO'
--exec dbo.AlumnosInsertar 'Armando', 2, 1
--exec dbo.AlumnosActualizar 1, 'Magdiel Moreno', 3, 1
--exec dbo.AlumnosDesactivar 1
exec dbo.AlumnosActiveGetSelect
exec dbo.AlumnosGetSelect