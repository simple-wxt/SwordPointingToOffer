package offer;

/**
 *  单例模式
 * 
 * */
public class No2 {
	/**
     * 单例模式，懒汉式，线程安全
     */
	public static class SingleTon{
		private final static SingleTon INSTANCE = new SingleTon();
		
		private SingleTon(){
			
		}
		
		public static SingleTon getInstance(){
			return INSTANCE;
		}
	}
	
	/**
	 * 单例模式，饿汉式，线程不安全
	 */
	public static class SingleTon2{
		private static SingleTon2 INSTANCE = null;
		
		private SingleTon2(){
			
		}
		
		public static SingleTon2 getInstance(){
			if(INSTANCE == null){
				INSTANCE = new SingleTon2();
			}
				return INSTANCE;
		}
	}
	
	/**
	 * 单例模式，饿汉式，线程安全，多线程环境下效率不高 
	 */
	public static class SingleTon3{
		private static SingleTon3 INSTANCE = null;
		
		private SingleTon3(){
			
		}
		
		public static synchronized SingleTon3 getInstance(){
			if(INSTANCE == null){
				INSTANCE = new SingleTon3();
			}
			return INSTANCE;
		}
	}
	
	/**
	 * 单例模式，饿汉式，另一种加锁方式
	 */
	public static class SingleTon4{
		private static SingleTon4 INSTANCE = null;
		
		private SingleTon4(){
			
		}
		public static SingleTon4 getInstance(){
			if(INSTANCE == null){
				synchronized(SingleTon4.class){
					if(INSTANCE == null){
						INSTANCE = new SingleTon4();
					}
				}
				
			}
			return INSTANCE;
		}
	}
	
	/**
	 * 单例模式，饿汉式，变种，线程安全 
	 */
	public static class SingleTon5{
		private static SingleTon5 INSTANCE = null;
		static{
			INSTANCE = new SingleTon5();
		}
		private SingleTon5(){
			
		}
		public static SingleTon5 getInstance(){
			return INSTANCE;
		}
	}
	    
	/**
	 * 单例模式，懒汉式，使用静态内部类，线程安全【推荐】
	 */
	public static class SingleTon6{
		private final static class SingleTonHolder{
			private static SingleTon6 INSTANCE = new SingleTon6();
		}
		private SingleTon6(){
			
		}
		
		public static SingleTon6 getInstance(){
			return SingleTonHolder.INSTANCE;
		}
	}
	
	/**
	 * 单例模式，静态内部类，使用枚举方式，线程安全【推荐】
	 */
	public enum SingleTon7{
		INSTANCE;
		public void whateverMethod(){
			
		}
	}
	
	/**
	 * 单例模式，静态内部类，使用双重校验锁，线程安全【推荐】
	 */
	public static class SingleTon8{
		private volatile static SingleTon8 INSTANCE = null;
		
		private SingleTon8(){}
		
		public static SingleTon8 getInstance(){
			if(INSTANCE == null){
				synchronized(SingleTon8.class){
					if(INSTANCE == null){
						INSTANCE = new SingleTon8();
					}
				}
			}
			return INSTANCE;
		}
	}
	public static void main(String[] args) {
		System.out.println(SingleTon.getInstance() == SingleTon.INSTANCE);
		System.out.println(SingleTon2.getInstance() == SingleTon2.getInstance());
		System.out.println(SingleTon3.getInstance() == SingleTon3.getInstance());
		System.out.println(SingleTon4.getInstance() == SingleTon4.getInstance());
		System.out.println(SingleTon5.getInstance() == SingleTon5.getInstance());
		System.out.println(SingleTon6.getInstance() == SingleTon6.getInstance());
		System.out.println(SingleTon7.INSTANCE == SingleTon7.INSTANCE);
		System.out.println(SingleTon8.getInstance() == SingleTon8.getInstance());
	}
}
