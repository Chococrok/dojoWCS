public class Slug{
	public static String slug( String toSlug){
		toSlug = toSlug.toLowerCase();
		toSlug = toSlug.replace(' ', '-');
		
		return toSlug;
	}

}
