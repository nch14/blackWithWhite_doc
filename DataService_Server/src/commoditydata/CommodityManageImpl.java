package commoditydata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

import Dataservice.FileHelper;
import bill.StockBill_In;
import bill.StockBill_Out;
import bill.StockBlockInfo;
import bill.StockFillmentInfo;
import data.commodity.CommodityManage;
import database.Database_StockBlockInfo;
import database.Database_StockFillment;

public class CommodityManageImpl extends UnicastRemoteObject implements CommodityManage{
	public static Database_StockBlockInfo database_StockBlockInfo;
	public static Database_StockFillment database_StockFillment;
	//public static Database_StockOverview database_StockOverview;
	
	public static boolean ready1=false;
	public static boolean ready2=false;
	public static boolean ready3=false;
	
	final static String dir1="ser/StockBlockInfo.ser";
	final static String dir2="ser/StockFillment.ser";
	final static String dir3="ser/StockOverview.ser";
	
	protected CommodityManageImpl() throws FileNotFoundException, ClassNotFoundException, IOException{
		super();
		if(!ready1){
			database_StockBlockInfo=(Database_StockBlockInfo) FileHelper.read(dir1);
			ready1=true;
		}
		if(!ready2){
			database_StockFillment=(Database_StockFillment) FileHelper.read(dir2);
			ready2=true;
		}
//		if(!ready3){
//			database_StockOverview=(Database_StockOverview) FileHelper.read(dir3);
//			ready3=true;
//		}
	}
	
	public static void save() throws FileNotFoundException, IOException{
		FileHelper.write(dir1, database_StockBlockInfo);
		FileHelper.write(dir2, database_StockFillment);
		//FileHelper.write(dir3, database_StockOverview);
	}


	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean adjustCommodity(String ID,String num, String block) throws RemoteException {
		// TODO Auto-generated method stub
		return database_StockBlockInfo.get(ID).adjust(num, block);
	}

	@Override
	public boolean init(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public StockBlockInfo checkCommodity(String id) throws RemoteException {
		// TODO Auto-generated method stub
		StockBlockInfo block=database_StockBlockInfo.get(id);
		return block;
	}

	public static StockBill_In addPosition(StockBill_In t,String s){
		return database_StockBlockInfo.getPosition(t, s);
	}
	
	public static boolean freePosition(StockBill_Out t,String s){
		return database_StockBlockInfo.free(t, s);
	}
	
	
}
