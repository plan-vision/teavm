package org.teavm.jso;

/* allows custom JS generation of 
  $rt_callWithReceiver(...) in JSAliasGenertor.java (jso-impl) */
public abstract class JSAliasRendererCustomWrapper {
	
	private static JSAliasRendererCustomWrapper val;
	public static JSAliasRendererCustomWrapper get() {
		return val;
	}
	public static void set(JSAliasRendererCustomWrapper val) {
		JSAliasRendererCustomWrapper.val=val;
	}
	public abstract String generate(String classAndMethodName);
	
}
