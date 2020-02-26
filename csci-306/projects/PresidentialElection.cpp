/** 
Source: https://www.rollingstone.com/politics/politics-lists/2020-democratic-candidates-issues-policy-positions-820811/
**/

#include <map>
#include <iostream>
using namespace std;

int main() {
  std::string option = "";

  map<std::string, map<std::string, std::string >> candidates = {
    {
      "Sanders", {
        {"delegates", "45"}, 
        {"needed_delegates", "97.74%"},
        {"campaign_promise", "Sanders is the author of Medicare for All legislation in the Senate. His bill would transform Medicare into cradle-to-grave insurance coverage for all American residents, financed by taxes, so there would be no fees at doctors offices, emergency rooms, or hospitals."}
      }
    },
    {
      "Buttigieg", {
        {"delegates", "25"}, 
        {"needed_delegates", "98.74%"},
        {"campaign_promise", "Buttigieg supported the Paris climate accord, and told CNN that he believes the Green New Deal is 'the right beginning' to tackling what he has described as a national emergency. He supports 'a carbon tax-and-dividend for Americans, and major direct investment to build a 100% clean energy society.'"}
      }
    },
    {
      "Warren", {
        {"delegates", "8"}, 
        {"needed_delegates", "99.6%"},
        {"campaign_promise", "Warren has the most aggressive tax-the-rich proposal in the field. Under her 'Ultra-Millionaire' wealth tax, households with a net worth of more than $50 million would be taxed 2 percent on every dollar of net worth above $50 million, and a 3 percent on every dollar of net worth above $1 billion. Warren estimates the tax, which would apply to about 75,000 households, would bring in $2.75 trillion in revenue over 10 years."}
      }
    },
    {
      "Biden", {
        {"delegates", "15"}, 
        {"needed_delegates", "99.25%"},
        {"campaign_promise", "Biden does not support Medicare for All, instead favoring an expansion of the Affordable Care Act. Last summer, he unveiled a health care plan built around subsidizing the 'big fucking deal' he helped pass as Obama’s vice president. Biden’s 2020 plan would also offer a Medicare-like public option that Americans would be able to buy into."}
      }
    },
    {
      "Klobuchar", {
        {"delegates", "7"}, 
        {"needed_delegates", "99.65%"},
        {"campaign_promise", "Klobuchar supports a pathway to citizenship for most undocumented immigrants and an increase in legal immigration. She calls for reform, rather than abolition, of ICE."}
      }
    },
    {
      "Bloomberg", {
        {"delegates", "0"}, 
        {"needed_delegates", "100%"},
        {"campaign_promise", "Bloomberg has proposed a repeal of President Trump’s 2017 tax cut that was aimed largely at corporations and the wealthy; a new 5-percent tax on incomes over $5 million; and raising capital gains tax on those earning more than $1 million per year. Bloomberg estimates his tax proposal would bring in $5 trillion in new tax revenue."}
      }
    },
    {
      "Gabbard", {
        {"delegates", "0"}, 
        {"needed_delegates", "100%"},
        {"campaign_promise", "Gabbard has been stridently anti-interventionist, and believes the United States should withdraw troops from Afghanistan and Syria. But her approach to foreign policy has gone beyond taking a strong anti-war position. She has bene widely criticized for visiting murderous Syrian dictator Bashar al-Assad in 2017 on a secret 'fact-finding' mission while dismissing his opposition — across the board — as 'terrorists.'"}
      }
    },
    {
      "Steyer", {
        {"delegates", "0"}, 
        {"needed_delegates", "100%"},
        {"campaign_promise", "Steyer, a billionaire, is one of the few candidates to have proposed an outright wealth tax. His version would add an additional 1 percent tax on the top 0.1 percent of American families."}
      }
    },
    {
      "Trump", {
        {"delegates", "86"}, 
        {"needed_delegates", "93.05%"},
        {"campaign_promise", "Mr Trump initially promised to ban all Muslims entering the US - a 'total and complete shutdown should remain until the US authorities 'can figure out what's going on'. But he switched to 'extreme vetting' after he became the party's presidential candidate."}
      }
    },
    {
      "Walsh", {
        {"delegates", "0"}, 
        {"needed_delegates", "100%"},
        {"campaign_promise", "Walsh believes in building a wall at the border, but told Woodruff he would not separate families. He said President Donald Trump’s moves have made a humanitarian crisis worse. 'People coming to claim asylum — that has nothing to do with a wall.' Walsh also said that the United States has to devote resources to deal with asylum cases more urgently."}
      }
    },
    {
      "Weld", {
        {"delegates", "1"}, 
        {"needed_delegates", "100%"},
        {"campaign_promise", "On the 2016 campaign trail, Weld called nuclear proliferation 'the number one threat to the security of the world.' Weld is a member of the Council on Foreign Relations, and, has called for the U.S. to form closer ties with Mexico and Canada in order to address security and economic challenges."}
      }
    },
    {
      "De La Fuente", {
        {"delegates", "0"}, 
        {"needed_delegates", "100%"},
        {"campaign_promise", "De La Fuente believes that we should focus on the original goals of health care reform; lower cost, improved quality and open access. That we need to address reform in a way that addresses ever-increasing cost along side of decreasing access."}
      }
    }
  };

  while (option != "Quit") {
    cout << "Enter a candidate’s name or enter Quit to quit.\n"; 
    cin >> option;
    if (candidates.find(option) != candidates.end()) {
      std::cout << option << " currently has " << candidates[option]["delegates"] << " delegates and needs " << candidates[option]["needed_delegates"] << " more votes.\n";
      std::cout << "Campaign Promise: " << candidates[option]["campaign_promise"] << "\n\n";
    } else if (option == "Quit") {
      cout << "\n";
      cout << "Leading Democratic Candidate: Sanders\n";
      cout << "Leading Republican Candidate: Trump\n";
    } else {
      std::cout << "Can not find candidate. Please try again\n";
    }
  }

  return 0;
}
