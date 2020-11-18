package com.example.demo.multitenant;

public class TenantContext {
	
	//cutenant current tenant
	public static ThreadLocal<String> cutenant=new InheritableThreadLocal<>();

	public static String getCutenant() {
		return cutenant.get();
	}

	public static void setCutenant(String tenant) {
		cutenant.set(tenant);
	}
	
	

    public static void clear() {
        cutenant.set(null);
    }
	

}
