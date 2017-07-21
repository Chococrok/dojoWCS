public class Slug {
    public static String slugify (String str) {
        
        str = str.toLowerCase();
        str = str.replace( ' ' , '-');
        return (str);
    }
}