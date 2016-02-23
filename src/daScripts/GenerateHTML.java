package daScripts;

public class GenerateHTML {
public static void beginning(){
	//Beginning, including table headers, to the body
	System.out.println("<!DOCTYPE html><head><script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>"+
    "<link rel=\"stylesheet\" type=\"text/css\" href=\"dataTables.css\"><script src = \"dataTables.js\"></script></head><body><table id = \"myTable\">"+
		"<thead><th>Page</th><th>Section</th><th>Status</th><th>Details</th></thead><tbody>");
}

public static void end(){
	System.out.println("</tbody></table><script type=\"text/javascript\">$(document).ready(function(){$('#myTable').DataTable();"+
"});</script></body>");
}
}
