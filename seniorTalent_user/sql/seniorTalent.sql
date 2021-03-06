USE [PICC]
GO
/****** Object:  Table [dbo].[SeniorTalent]    Script Date: 2018-11-22 10:25:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[SeniorTalent](
	[jlxh] [numeric](18, 0) IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](20) NULL,
	[sfzh] [varchar](18) NULL,
	[brxb] [int] NULL,
	[csny] [date] NULL,
	[lxdh] [varchar](20) NULL,
	[lxdz] [varchar](70) NULL,
	[yq] [varchar](2) NULL,
	[zfpb] [int] NULL,
	[mzhm] [varchar](12) NULL,
	[zyhm] [varchar](12) NULL,
	[disease] [varchar](20) NULL,
	[brid] [numeric](18, 0) NULL,
	[createTime] [datetime] NULL,
	[createYgdm] [varchar](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[jlxh] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[SeniorTalent] ON 

GO
INSERT [dbo].[SeniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [yq], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm]) VALUES (CAST(1 AS Numeric(18, 0)), N'章安逸', N'331022201802260223', 2, CAST(0xEE3D0B00 AS Date), N'13566882226', N'健跳镇居民', N'01', 0, N'5002341673', N'', N'1', CAST(106497366 AS Numeric(18, 0)), NULL, NULL)
GO
INSERT [dbo].[SeniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [yq], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm]) VALUES (CAST(2 AS Numeric(18, 0)), N'郑筱丽', N'331003199001031341', 2, CAST(0xC5150B00 AS Date), N'13989615867', N'头陀镇双楠村', N'01', 0, N'5002341969', N'', N'3', CAST(106497884 AS Numeric(18, 0)), NULL, NULL)
GO
INSERT [dbo].[SeniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [yq], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm]) VALUES (CAST(3 AS Numeric(18, 0)), N'周佳翰', N'331023201708141478', 1, CAST(0x2A3D0B00 AS Date), N'15058630700', N'白鹤镇上西山村', N'01', 0, N'5002342050', NULL, N'2', CAST(106498032 AS Numeric(18, 0)), NULL, NULL)
GO
INSERT [dbo].[SeniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [yq], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm]) VALUES (CAST(4 AS Numeric(18, 0)), N'沈真国', N'332624197211100399', 1, CAST(0x4EFD0A00 AS Date), N'13656892546', N'下沈村', N'01', 0, N'5002252029', N'', N'2', CAST(106331885 AS Numeric(18, 0)), NULL, NULL)
GO
INSERT [dbo].[SeniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [yq], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm]) VALUES (CAST(5 AS Numeric(18, 0)), N'柯伟芬', N'332624198010082125', 2, CAST(0x97080B00 AS Date), N'18815230267', N'前园村', N'01', 0, N'5001520962', NULL, N'1', CAST(106498040 AS Numeric(18, 0)), NULL, NULL)
GO
INSERT [dbo].[SeniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [yq], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm]) VALUES (CAST(6 AS Numeric(18, 0)), N'朱欣培', N'331082199909182380', 2, CAST(0x9E230B00 AS Date), N'18358692299', N'临海柏叶路', N'01', 0, N'5001520965', NULL, N'1', NULL, NULL, NULL)
GO
INSERT [dbo].[SeniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [yq], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm]) VALUES (CAST(7 AS Numeric(18, 0)), N'江夏雨', N'331082198906080018', 1, CAST(0xF4140B00 AS Date), N'13819622712', N'浙江临海农村商业银行股份有限公司', N'01', 0, N'5001519992', NULL, N'1', NULL, NULL, NULL)
GO
INSERT [dbo].[SeniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [yq], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm]) VALUES (CAST(8 AS Numeric(18, 0)), N'王子萌', N'331082201105200029', 2, CAST(0x44340B00 AS Date), N'15557675119', N'花街社区', N'01', 0, N'5001520001', NULL, N'1', NULL, NULL, NULL)
GO
INSERT [dbo].[SeniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [yq], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm]) VALUES (CAST(9 AS Numeric(18, 0)), N'顾文君', N'332603196501271325', 2, CAST(0x32F20A00 AS Date), N'13524468159', N'黄岩区头陀镇胡岙村', N'01', 0, N'5002341766', NULL, N'1', NULL, NULL, NULL)
GO
INSERT [dbo].[SeniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [yq], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm]) VALUES (CAST(10 AS Numeric(18, 0)), N'尤浩杨', N'331082201809097971', 1, CAST(0xB13E0B00 AS Date), N'18838737839', N'沙基村', N'01', 0, N'5002341780', NULL, N'1', NULL, NULL, NULL)
GO
INSERT [dbo].[SeniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [yq], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm]) VALUES (CAST(11 AS Numeric(18, 0)), N'金聪聪', N'33108219930921350X', 2, CAST(0x121B0B00 AS Date), N'13666849121', N'岭脚金村', N'01', 0, N'5002341887', NULL, N'1', NULL, NULL, NULL)
GO
INSERT [dbo].[SeniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [yq], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm]) VALUES (CAST(12 AS Numeric(18, 0)), N'包爱萍', N'33260219751011694X', 2, CAST(0x77010B00 AS Date), N'13666468515', N'蓬街镇联东村7组22户', N'01', 0, N'5002341899', NULL, N'1', NULL, NULL, NULL)
GO
INSERT [dbo].[SeniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [yq], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm]) VALUES (CAST(13 AS Numeric(18, 0)), N'蔡晓云', N'340621197910118767', 2, CAST(0x2C070B00 AS Date), N'18705863338', N'西溪村', N'01', 0, N'5002341914', NULL, N'1', NULL, NULL, NULL)
GO
INSERT [dbo].[SeniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [yq], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm]) VALUES (CAST(14 AS Numeric(18, 0)), N'王皿妹', N'332625196205106841', 2, CAST(0x51EE0A00 AS Date), N'15967054406', N'三合镇大横村', N'01', 0, N'5002341923', NULL, N'1', NULL, NULL, NULL)
GO
INSERT [dbo].[SeniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [yq], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm]) VALUES (CAST(15 AS Numeric(18, 0)), N'蒋正江', N'332621195510166859', 1, CAST(0xF3E40A00 AS Date), N'13566436956', N'浙江省临海市杜桥镇南溪村１-１６１号', N'01', 0, N'5001147361', N'00825099', N'1', CAST(106208291 AS Numeric(18, 0)), NULL, NULL)
GO
SET IDENTITY_INSERT [dbo].[SeniorTalent] OFF
GO
ALTER TABLE [dbo].[SeniorTalent] ADD  DEFAULT ((0)) FOR [zfpb]
GO
