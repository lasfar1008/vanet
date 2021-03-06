package vanet;


/**
 * Utility class for configurations.
 * 
 * This class contains all configuration of your simulator
 * 
 * @author Walter Dal Mut
 * @date 2009
 *
 */
public class Configs 
{
	/**
	 * Cover of WIFI 802.11 for computing map
	 */
	public static double wifiCover = 200D;
	/**
	 * Max vehicle speed in m/s
	 */
	public static double maxVehicleSpeed = 140D/3.6D;
	
	/**
	 * Address of broadcast server
	 */
	public static String SERVER_BROADCAST_ADDRESS = "127.255.255.255";
	
	/**
	 * Listening port
	 */
	public static int PORT = 55055; 
	
	/**
	 * Beacons/seconds
	 */
	public static double BEACONS_SEC = 0.5;
	
	/**
	 * Lock moves of vehicle for simulate only transmission and security implementation
	 */
	public static boolean NO_MOVES = false;
	
	/**
	 * Choose your simulator.
	 * 
	 * Values:
	 * bp -> BaseLine Pseudonyms
	 * gs -> Group Signature
	 */
	public static String SIMULATOR = "gs";
	
	/**
	 * Length of payload in bytes
	 */
	public static final int PAYLOAD_LENGTH = 200;
	
	//TODO: config file add this configurations
	/**
	 * This parameter force the certificate reattach every tot beacons
	 */
	public static int REATTACH_CERTIFICATE = 15;
	
	/**
	 * Max validity of certificate into wireless area
	 */
	public static int MAX_CERTIFICATE_VALIDITY_TIME = 5;
	
	/**
	 * Host for connect to mysql
	 */
	public static String MYSQL_HOST = "localhost";
	/**
	 * Username for authenticate into mysql server
	 */
	public static String MYSQL_USERNAME = "root";
	/**
	 * Password for authenticate into mysql server
	 */
	public static String MYSQL_PASSWORD = "";
	/**
	 * Database to use for save information
	 */
	public static String MYSQL_DATABASE = "vanet";
	
	/**
	 * Set log system:
	 *   0 MySQL log
	 *   1 File log
	 *   2 StdOut log
	 */
	public static int logSystem = 2;
}
