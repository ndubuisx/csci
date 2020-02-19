"""

Emmanuel Ndubuisi
CSCI 306
Project 1 - Weather.py
February 18, 2020

"""

class Weather:
	def __init__(self):
		self.previous_week_weather = {}
		
	def getUserInput(self):
		# get user input and assign to previous_week_weather
		days_of_week = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
		
		for day in days_of_week:
			usr_input = input("Enter the weather for %s: " % (day))
			self.previous_week_weather[day] = usr_input
		
	
	def getHighestTemp(self):
		highest = float('-inf')
		# iterate all the temperature values and print the highest value
		for key in self.previous_week_weather:
			if (self.previous_week_weather[key] > highest):
				highest = self.previous_week_weather[key]
				
		return highest
			
	def getLowestTemp(self):
		lowest = float('inf')
		# iterate all the temperature values and print the lowest value
		for key in self.previous_week_weather:
			if (self.previous_week_weather[key] < lowest):
				lowest = self.previous_week_weather[key]
		
		return lowest
	
	def getAverageTemp(self):
		sum = 0
		# iterate all the temperature values and find the sum
		for key in self.previous_week_weather:
			sum = sum + self.previous_week_weather[key]
		
		# divide the sum by 7 to get the average
		return sum/7
	
	def printResult(self):
		# print result by calling class methods
		print "Highest temperature: ", self.getHighestTemp()
		print "Lowest temperature: ", self.getLowestTemp()
		print "Average temperature: ", self.getAverageTemp()

if __name__ == "__main__":
	weather = Weather()
	weather.getUserInput()
	weather.printResult()
