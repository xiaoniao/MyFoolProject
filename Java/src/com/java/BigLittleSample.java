package com.java;

import java.nio.ByteOrder;

public class BigLittleSample {

	public static void main(String[] args) {

		if (ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN)) {
			System.out.println("¥Û∂À");
		} else {
			System.out.println("–°∂À");
		}

		String jpql = "SELECT     (SELECT     Phone" + "                       FROM          [shangqi].[dbo].Shop"
				+ "                       WHERE      (OrgID = [shangqi].[dbo].Repair.OwnerOrgID)) AS OrgTel,"
				+ "                          (SELECT     IsNetWork"
				+ "                            FROM          [shangqi].[dbo].[Shop] AS Shop_1"
				+ "                            WHERE      (OrgID = [shangqi].[dbo].Repair.OwnerOrgID)) AS NetWork, [shangqi].[dbo].Repair.AbnormityStatus, [shangqi].[dbo].Customer.Prov, [shangqi].[dbo].Customer.City, [shangqi].[dbo].Customer.Area,"
				+ "                      [shangqi].[dbo].Customer.Town, [shangqi].[dbo].Repair.RepairID, [shangqi].[dbo].Repair.BookPhone, [shangqi].[dbo].Repair.RepairCode, [shangqi].[dbo].Repair.RepairClass, [shangqi].[dbo].Repair.ServiceMode,"
				+ "                      [shangqi].[dbo].Repair.OwnerOrgID, [shangqi].[dbo].Repair.SendDate, DATEDIFF(day, [shangqi].[dbo].Repair.SendDate, GETDATE()) AS ExceedDay, [shangqi].[dbo].Repair.ProductID,"
				+ "                      [shangqi].[dbo].Repair.CustomerID, [shangqi].[dbo].Repair.AbnormityMan, [shangqi].[dbo].Repair.AbnormityDate, [shangqi].[dbo].Repair.AbnormityNote, [shangqi].[dbo].Repair.AbnormityNoteHistory,"
				+ "                      ISNULL([shangqi].[dbo].Repair.IsAbnormity, 0) AS IsAbnormitys, [shangqi].[dbo].Repair.IsAbnormity, [shangqi].[dbo].Repair.OwnerShopID, [shangqi].[dbo].Repair.OwnerCenterID,"
				+ "                      [shangqi].[dbo].Repair.ProductType, [shangqi].[dbo].Repair.ProductLine, [shangqi].[dbo].Customer.HomeTel, [shangqi].[dbo].Customer.OfficeTel, [shangqi].[dbo].Customer.Mobile, [shangqi].[dbo].Repair.Note,"
				+ "                      [shangqi].[dbo].Repair.ProductSource"
				+ "FROM         [shangqi].[dbo].Repair INNER JOIN"
				+ "                      [shangqi].[dbo].Customer ON [shangqi].[dbo].Repair.CustomerID = [shangqi].[dbo].Customer.CustomerID"
				+ "WHERE     ([shangqi].[dbo].Repair.Status IN ('02', '03')) AND ([shangqi].[dbo].Repair.WorkflowStepName <> '“—÷’÷π')";
		System.out.println(jpql);
	}

}
