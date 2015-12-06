package bill;
/**
 * 付款单
 * @author 倪辰皓
 *
 */
public class PaymentBill {
	public String ID;
	public String[] date;
	public double money;
	public String payer;//付款人
	public String type;//（条目（租金、运费、人员工资、奖励）
	public String remarks;//（租金年份、运单号、标注工资月份）
	
	/**
	 * 可以得到形如19960218的字符串
	 * @return
	 */
	public String getDate(){
		String result="";
		result+=date[0]+date[1]+date[2];
		return result;	
	}
}
