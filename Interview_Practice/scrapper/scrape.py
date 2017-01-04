import urllib, json
import pandas
url = "http://mlb.mlb.com/pubajax/wf/flow/stats.splayer?season=2016&sort_order=%27desc%27&sort_column=%27avg%27&stat_type=hitting&page_type=SortablePlayer&game_type=%27R%27&player_pool=QUALIFIER&season_type=ANY&sport_code=%27mlb%27&results=1000&recSP=1&recPP=300"
response = urllib.urlopen(url)
data = json.dumps(json.loads(response.read()))
print data

sudo spoof-mac randomize en0