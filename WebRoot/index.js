function getNews(msg) {
	var url = "news/getnews.jsp?id=" + escape(msg);
	begin(url);
}
function begin(url) {
	if (window.XMLHttpRequest) {
		req = new XMLHttpRequest();
	} else if (window.ActiveXObject) {
		req = new ActiveXObject("Microsoft.XMLHTTP");
	}
	req.open("GET", url, true);
	req.onreadystatechange = callback;
	req.send(null);
}
function callback() {
	if (req.readyState == 4) {
		if (req.status == 200) {
			var msg = req.responseXML.getElementsByTagName("msg")[0];
			setMsg(msg);
		}
	}
}
function setMsg(msg) {
	mdiv = document.getElementById("Layer1");
	if (msg.childNodes[0].nodeValue == "news") {
		var html = "<table border='1'>";
		for (var i = 2; i <= msg.childNodes[1].childNodes[0].nodeValue * 2 + 1; i=i+3) {
			html += "<tr><td><a href='news/news.jsp?id=";
			html += escape(msg.childNodes[i].childNodes[0].nodeValue);
			html += "'>";
			html += msg.childNodes[i+1].childNodes[0].nodeValue;
			html += "</a></td><td><font align='right' color='green' size='2'>";
			html += msg.childNodes[i+2].childNodes[0].nodeValue;
			html += "</font></td></tr>";
		}
		html+="</table>";
		mdiv.innerHTML = html;
	}
}
