# Weather App:

import requests

city=input("Enter Your City --> ")
Api_Key = "2606f769271b8d545fe3458b2b72ed9f" 

final_URL = "http://api.openweathermap.org/data/2.5/weather?q={}&appid={}".format(city,Api_Key)

result = requests.get(final_URL)
data = result.json()

temprature = data['main']['temp']
temp= temprature-273
cordinatelon = data['coord']['lon']
cordinatelat = data['coord']['lat']

print("Temperature - ",temp,"c")

