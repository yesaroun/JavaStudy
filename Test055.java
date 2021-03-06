/*===========================================
  ＝＝＝ 叔楳  斐硯税 珍闘継(鋼差庚) ＝＝＝
=============================================*/

// 鋼差庚(while) 叔柔

// 】 引薦
//		紫遂切稽採斗 績税税 舛呪研 脊径 閤焼
//		1採斗 脊径 閤精 益 舛呪猿走税
//		穿端 杯引, 側呪税 杯引, 筈呪税 杯聖
//		唖唖 衣引葵生稽 窒径馬澗 覗稽益轡聖 姥薄廃陥.

// 叔楳 森)
// 績税税 舛呪 脊径 : 280
// >> 1~280猿走 舛呪税 杯 : ししし
// >> 1~280猿走 側呪税 杯 : ししし
// >> 1~280猿走 筈呪税 杯 : ししし

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test055{
	public static void main(String[] args) throws IOException{
		
		// 爽推 痕呪 識情 貢 段奄鉢
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		

		int n;
		//-- 紫遂切税 脊径葵聖 舛呪 莫殿稽 眼焼馨 痕呪

		int i = 1;
		//-- while庚拭辞 紫遂吃 痕呪

		int sum = 0;
		//-- 舛呪税 刊旋杯聖 眼焼馨 痕呪

		int even = 0;
		//-- 側呪税 刊旋杯聖 眼焼馨 痕呪

		int odd = 0;
		//-- 筈呪税 刊旋杯聖 眼焼馨 痕呪


		// 尻至 貢 坦軒
		System.out.print("績税税 舛呪 脊径 : ");
		n = Integer.parseInt(br.readLine());
		// 紫遂切税 脊径葵聖 舛呪 莫殿稽 眼焼蛙


		while(i <= n){
			// 脊径廃 舛呪葵猿走 while庚 鋼差

			sum += i;
			// 1採斗 脊径廃 舛呪葵猿走 舛呪 刊旋杯
			
			if(i % 2 == 0){
				even += i;
				// 側呪税 井酔 even痕呪拭 刊旋杯

			} else {
				odd += i;
				// 筈呪税 井酔 odd 痕呪拭 刊旋杯
			}

			i++;
		}
		
		// 衣引 窒径
		System.out.printf(">> 1 ~ %d猿走税 舛呪税 杯 : %d\n", n, sum);
		System.out.printf(">> 1 ~ %d猿走税 側呪税 杯 : %d\n", n, even);
		System.out.printf(">> 1 ~ %d猿走税 筈呪税 杯 : %d\n", n, odd);
	}
}

// 叔楳 衣引

/*
績税税 舛呪 脊径 : 280
>> 1 ~ 280猿走税 舛呪税 杯 : 39340
>> 1 ~ 280猿走税 側呪税 杯 : 19740
>> 1 ~ 280猿走税 筈呪税 杯 : 19600
域紗馬形檎 焼巷 徹蟹 刊牽淑獣神 . . .
*/