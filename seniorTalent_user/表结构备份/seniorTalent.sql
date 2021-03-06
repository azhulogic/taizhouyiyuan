USE [PICC]
GO
/****** Object:  Table [dbo].[seniorTalent]    Script Date: 2019-1-7 16:42:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[seniorTalent](
	[jlxh] [numeric](18, 0) IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](20) NULL,
	[sfzh] [varchar](18) NULL,
	[brxb] [int] NULL,
	[csny] [date] NULL,
	[lxdh] [varchar](20) NULL,
	[lxdz] [varchar](70) NULL,
	[zfpb] [int] NULL,
	[mzhm] [varchar](12) NULL,
	[zyhm] [varchar](12) NULL,
	[disease] [varchar](20) NULL,
	[brid] [varchar](18) NULL,
	[createTime] [datetime] NULL,
	[createYgdm] [varchar](20) NULL,
	[height] [numeric](3, 2) NULL,
	[weight] [numeric](4, 1) NULL,
	[searchBz] [int] NOT NULL,
	[sfNo] [int] NOT NULL,
	[orderNo] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[jlxh] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[seniorTalent] ON 

INSERT [dbo].[seniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm], [height], [weight], [searchBz], [sfNo], [orderNo]) VALUES (CAST(1 AS Numeric(18, 0)), N'章安逸', N'331022201802260223', 2, CAST(0xEE3D0B00 AS Date), N'13566882226', N'健跳镇居民', 0, N'5002341673', N'', N'1', N'106497366', NULL, NULL, NULL, NULL, 0, 0, 0)
INSERT [dbo].[seniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm], [height], [weight], [searchBz], [sfNo], [orderNo]) VALUES (CAST(2 AS Numeric(18, 0)), N'郑筱丽', N'331003199001031341', 2, CAST(0xC5150B00 AS Date), N'13989615867', N'头陀镇双楠村', 0, N'5002341969', N'', N'3', N'106497884', NULL, NULL, NULL, NULL, 0, 0, 0)
INSERT [dbo].[seniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm], [height], [weight], [searchBz], [sfNo], [orderNo]) VALUES (CAST(3 AS Numeric(18, 0)), N'周佳翰', N'331023201708141478', 1, CAST(0x2A3D0B00 AS Date), N'15058630700', N'白鹤镇上西山村', 0, N'5002342050', NULL, N'2', N'106498032', NULL, NULL, NULL, NULL, 0, 0, 0)
INSERT [dbo].[seniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm], [height], [weight], [searchBz], [sfNo], [orderNo]) VALUES (CAST(4 AS Numeric(18, 0)), N'沈真国', N'332624197211100399', 1, CAST(0x4EFD0A00 AS Date), N'13656892546', N'下沈村', 0, N'5002252029', N'', N'2', N'106331885', NULL, NULL, NULL, NULL, 0, 0, 0)
INSERT [dbo].[seniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm], [height], [weight], [searchBz], [sfNo], [orderNo]) VALUES (CAST(5 AS Numeric(18, 0)), N'柯伟芬', N'332624198010082125', 2, CAST(0x97080B00 AS Date), N'18815230267', N'前园村', 0, N'5001520962', NULL, N'1', N'106498040', NULL, NULL, NULL, NULL, 0, 0, 0)
INSERT [dbo].[seniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm], [height], [weight], [searchBz], [sfNo], [orderNo]) VALUES (CAST(6 AS Numeric(18, 0)), N'朱欣培', N'331082199909182380', 2, CAST(0x9E230B00 AS Date), N'18358692299', N'临海柏叶路', 0, N'5001520965', NULL, N'1', NULL, NULL, NULL, NULL, NULL, 0, 0, 0)
INSERT [dbo].[seniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm], [height], [weight], [searchBz], [sfNo], [orderNo]) VALUES (CAST(7 AS Numeric(18, 0)), N'江夏雨', N'331082198906080018', 1, CAST(0xF4140B00 AS Date), N'13819622712', N'浙江临海农村商业银行股份有限公司', 0, N'5001519992', NULL, N'99', NULL, NULL, NULL, CAST(1.75 AS Numeric(3, 2)), CAST(50.0 AS Numeric(4, 1)), 1, 0, 5)
INSERT [dbo].[seniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm], [height], [weight], [searchBz], [sfNo], [orderNo]) VALUES (CAST(8 AS Numeric(18, 0)), N'王子萌', N'331082201105200029', 2, CAST(0x44340B00 AS Date), N'15557675119', N'花街社区', 0, N'5001520001', NULL, N'99', NULL, NULL, NULL, CAST(1.75 AS Numeric(3, 2)), CAST(75.0 AS Numeric(4, 1)), 1, 0, 1)
INSERT [dbo].[seniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm], [height], [weight], [searchBz], [sfNo], [orderNo]) VALUES (CAST(9 AS Numeric(18, 0)), N'顾文君', N'332603196501271325', 2, CAST(0x32F20A00 AS Date), N'13524468159', N'黄岩区头陀镇胡岙村', 0, N'5002341766', NULL, N'0', NULL, NULL, NULL, NULL, NULL, 0, 0, 0)
INSERT [dbo].[seniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm], [height], [weight], [searchBz], [sfNo], [orderNo]) VALUES (CAST(10 AS Numeric(18, 0)), N'尤浩杨', N'331082201809097971', 1, CAST(0xB13E0B00 AS Date), N'18838737839', N'沙基村', 0, N'5002341780', NULL, N'99', NULL, NULL, NULL, CAST(1.75 AS Numeric(3, 2)), CAST(90.0 AS Numeric(4, 1)), 1, 0, 0)
INSERT [dbo].[seniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm], [height], [weight], [searchBz], [sfNo], [orderNo]) VALUES (CAST(11 AS Numeric(18, 0)), N'金聪聪', N'33108219930921350X', 2, CAST(0x121B0B00 AS Date), N'13666849121', N'岭脚金村', 0, N'5002341887', NULL, N'0', NULL, NULL, NULL, NULL, NULL, 0, 0, 0)
INSERT [dbo].[seniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm], [height], [weight], [searchBz], [sfNo], [orderNo]) VALUES (CAST(12 AS Numeric(18, 0)), N'包爱萍', N'33260219751011694X', 2, CAST(0x77010B00 AS Date), N'13666468515', N'蓬街镇联东村7组22户', 0, N'5002341899', NULL, N'0', NULL, NULL, NULL, NULL, NULL, 0, 0, 0)
INSERT [dbo].[seniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm], [height], [weight], [searchBz], [sfNo], [orderNo]) VALUES (CAST(13 AS Numeric(18, 0)), N'蔡晓云', N'340621197910118767', 2, CAST(0x2C070B00 AS Date), N'18705863338', N'西溪村', 0, N'5002341914', NULL, N'0', NULL, NULL, NULL, NULL, NULL, 0, 0, 0)
INSERT [dbo].[seniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm], [height], [weight], [searchBz], [sfNo], [orderNo]) VALUES (CAST(14 AS Numeric(18, 0)), N'王皿妹', N'332625196205106841', 2, CAST(0x51EE0A00 AS Date), N'15967054406', N'三合镇大横村', 0, N'5002341923', NULL, N'0', NULL, NULL, NULL, NULL, NULL, 0, 0, 0)
INSERT [dbo].[seniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm], [height], [weight], [searchBz], [sfNo], [orderNo]) VALUES (CAST(15 AS Numeric(18, 0)), N'蒋正江', N'332621195510166859', 1, CAST(0xF3E40A00 AS Date), N'13566436956', N'浙江省临海市杜桥镇南溪村１-１６１号', 0, N'5001147361', N'00825099', N'0', N'106208291', NULL, NULL, NULL, NULL, 0, 0, 0)
INSERT [dbo].[seniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm], [height], [weight], [searchBz], [sfNo], [orderNo]) VALUES (CAST(17 AS Numeric(18, 0)), N'订单', N'111', 1, CAST(0xE63E0B00 AS Date), N'1', N'1', 0, N'1', N'1', N'0', N'1', NULL, NULL, NULL, NULL, 0, 0, 0)
INSERT [dbo].[seniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm], [height], [weight], [searchBz], [sfNo], [orderNo]) VALUES (CAST(18 AS Numeric(18, 0)), N'订单', N'2222', 1, CAST(0x05380B00 AS Date), N'11', N'11', 0, N'2', N'2', N'0', N'3', NULL, NULL, NULL, NULL, 0, 0, 0)
INSERT [dbo].[seniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm], [height], [weight], [searchBz], [sfNo], [orderNo]) VALUES (CAST(19 AS Numeric(18, 0)), N'订单3', N'333', 1, CAST(0xE83E0B00 AS Date), N'33', N'3', 0, N'3', N'3', N'0', N'3', CAST(0x0000A9A0012288CD AS DateTime), N'1213', NULL, NULL, 0, 0, 0)
INSERT [dbo].[seniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm], [height], [weight], [searchBz], [sfNo], [orderNo]) VALUES (CAST(21 AS Numeric(18, 0)), N'sdsd', N'4444', 1, CAST(0xEE3D0B00 AS Date), N'123456', N'', 0, N'', N'', N'0', N'3', CAST(0x0000A9A600983479 AS DateTime), N'1213', NULL, NULL, 0, 0, 0)
INSERT [dbo].[seniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm], [height], [weight], [searchBz], [sfNo], [orderNo]) VALUES (CAST(22 AS Numeric(18, 0)), N'wewew', N'55555', 1, CAST(0xEE3D0B00 AS Date), N'', N'', 0, N'', N'', N'0', N'', CAST(0x0000A9A6009BF51A AS DateTime), N'1213', NULL, NULL, 0, 0, 0)
INSERT [dbo].[seniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm], [height], [weight], [searchBz], [sfNo], [orderNo]) VALUES (CAST(23 AS Numeric(18, 0)), N'test', N'331003198302202074', 1, CAST(0xF80B0B00 AS Date), N'18267680072', N'黄岩', 0, N'998087953', N'', N'0', N'', CAST(0x0000A9B500D9A335 AS DateTime), N'BSSA', NULL, NULL, 0, 0, 0)
INSERT [dbo].[seniorTalent] ([jlxh], [name], [sfzh], [brxb], [csny], [lxdh], [lxdz], [zfpb], [mzhm], [zyhm], [disease], [brid], [createTime], [createYgdm], [height], [weight], [searchBz], [sfNo], [orderNo]) VALUES (CAST(29 AS Numeric(18, 0)), N'飞飞飞', N'331082199509035832', 1, CAST(0xDA1D0B00 AS Date), N'', N'', 0, N'', N'', N'0', N'', CAST(0x0000A9BD010547F1 AS DateTime), N'BSSA', NULL, NULL, 0, 0, 0)
SET IDENTITY_INSERT [dbo].[seniorTalent] OFF
ALTER TABLE [dbo].[seniorTalent] ADD  DEFAULT ((0)) FOR [zfpb]
GO
ALTER TABLE [dbo].[seniorTalent] ADD  CONSTRAINT [DF_SeniorTalent_searchBz]  DEFAULT ((0)) FOR [searchBz]
GO
ALTER TABLE [dbo].[seniorTalent] ADD  CONSTRAINT [DF_SeniorTalent_sfNo]  DEFAULT ((0)) FOR [sfNo]
GO
ALTER TABLE [dbo].[seniorTalent] ADD  CONSTRAINT [DF_SeniorTalent_orderNo]  DEFAULT ((0)) FOR [orderNo]
GO
