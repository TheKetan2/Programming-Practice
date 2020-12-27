import requests
def movie_title(url):
	body = requests.get(url).text
	return body[body.index("<title>")+7: body.index("</title>")]
	