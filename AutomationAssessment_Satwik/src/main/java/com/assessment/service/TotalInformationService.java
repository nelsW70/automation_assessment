package com.assessment.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;


import com.assessment.model.Questions;
import com.assessment.model.TotalInformation;
import com.assessment.util.AppConstants;

import ch.qos.logback.core.joran.conditional.ElseAction;



@Component
public class TotalInformationService {
	


	public TotalInformation getDetails(TotalInformation totalInformation) {
		Questions question = new Questions();
		question.setQuestion("What automation tools do you currently use?");
		List<Questions> questions = new ArrayList<Questions>();
		questions.add(question);

		question = new Questions();
		question.setQuestion("What kind of automation frameworks do you currently use?");
		questions.add(question);

		question = new Questions();
		question.setQuestion("What platform is the application used on?");
		questions.add(question);

		question = new Questions();
		question.setQuestion("What is your current automation Test Coverage?");
		questions.add(question);

		question = new Questions();
		question.setQuestion("What methodologies do you use in your Software Development Cycle?");
		questions.add(question);

		question = new Questions();
		question.setQuestion("How frequent are your release cycles?");
		questions.add(question);
		

		question = new Questions();
		question.setQuestion("How many automation testers do you have in your team/company?");
		questions.add(question);
		
		question = new Questions();
		question.setQuestion("What is the current percentage of production defects, detected by automation scripts?");
		questions.add(question);
		
		question = new Questions();
		question.setQuestion("What is the Enterprise tool used for Software Development Life Cycle?");
		questions.add(question);
		
		question = new Questions();
		question.setQuestion("What are the major browsers used?");
		questions.add(question);
		
		totalInformation.setQuestions(questions);
		return totalInformation;
	}

	public void setQuestion_1a(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		List<String> list = new ArrayList<String>();
		
		resetOptions(totalInformation, 0);
		

		if ("on".equals(httpRequest.getParameter("checkbox100a"))) {
			totalInformation.getQuestions().get(0).setOption1(true);
			list.add(AppConstants.HP_QTP_UF_LeannFT);
			
		}

		if ("on".equals(httpRequest.getParameter("checkbox101a"))) {
			totalInformation.getQuestions().get(0).setOption2(true);
			list.add(AppConstants.IBM_RFT);
		}

		if ("on".equals(httpRequest.getParameter("checkbox102a"))) {
			totalInformation.getQuestions().get(0).setOption3(true);
			list.add(AppConstants.SELENIUM);
		}
		if ("on".equals(httpRequest.getParameter("checkbox103a"))) {
			totalInformation.getQuestions().get(0).setOption4(true);
			list.add(AppConstants.MICROSOFT_CODEED_UI);
		}
		if ("on".equals(httpRequest.getParameter("checkbox104a"))) {
			totalInformation.getQuestions().get(0).setOption5(true);
			list.add(AppConstants.PERFORMANCE_TESTNG_TOOL);
		}
		if ("on".equals(httpRequest.getParameter("checkbox105a"))) {
			totalInformation.getQuestions().get(0).setOther1(httpRequest.getParameter("questions[0].other1"));
			totalInformation.getQuestions().get(0).setOption6(true);
			list.add(httpRequest.getParameter("questions[0].other1"));
		}
		if ("on".equals(httpRequest.getParameter("checkbox106a"))) {
			totalInformation.getQuestions().get(0).setOther2(httpRequest.getParameter("questions[0].other2"));
			totalInformation.getQuestions().get(0).setOption7(true);
			list.add(httpRequest.getParameter("questions[0].other2"));
		}

		totalInformation.getQuestions().get(0).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);
	}

	private void resetOptions(TotalInformation totalInformation, int position) {
		totalInformation.getQuestions().get(position).setOption1(false);
		totalInformation.getQuestions().get(position).setOption2(false);
		totalInformation.getQuestions().get(position).setOption3(false);
		totalInformation.getQuestions().get(position).setOption4(false);
		totalInformation.getQuestions().get(position).setOption5(false);
		totalInformation.getQuestions().get(position).setOption6(false);
		totalInformation.getQuestions().get(position).setOption7(false);
	}

	public void setQuestion_2a(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		resetOptions(totalInformation, 1);
		List<String> list = new ArrayList<String>();

		if ("on".equals(httpRequest.getParameter("checkbox200a"))) {
			totalInformation.getQuestions().get(1).setOption1(true);
			list.add("Descriptive Programming");
		}

		if ("on".equals(httpRequest.getParameter("checkbox201a"))) {
			totalInformation.getQuestions().get(1).setOption2(true);
			list.add("Record & Play");
		}

		if ("on".equals(httpRequest.getParameter("checkbox202a"))) {
			totalInformation.getQuestions().get(1).setOption3(true);
			list.add("Both");
		}
		totalInformation.getQuestions().get(1).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);
	}

	public void setQuestion_3a(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		resetOptions(totalInformation, 2);
		List<String> list = new ArrayList<String>();

		if ("on".equals(httpRequest.getParameter("checkbox300a"))) {
			totalInformation.getQuestions().get(2).setOption1(true);
			list.add("Desktop/Thin/Thick");
		}

		if ("on".equals(httpRequest.getParameter("checkbox301a"))) {
			totalInformation.getQuestions().get(2).setOption2(true);
			list.add("Web Application");
		}

		if ("on".equals(httpRequest.getParameter("checkbox302a"))) {
			totalInformation.getQuestions().get(2).setOption3(true);
			list.add("Main Frame");
		}
		if ("on".equals(httpRequest.getParameter("checkbox303a"))) {
			totalInformation.getQuestions().get(2).setOption4(true);
			list.add("Mobile");
		}
		totalInformation.getQuestions().get(2).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);
	}

	public void setQuestion_4a(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		resetOptions(totalInformation, 3);
		List<String> list = new ArrayList<String>();

		if ("on".equals(httpRequest.getParameter("checkbox400a"))) {
			totalInformation.getQuestions().get(3).setOption1(true);
			list.add("Less than 25%");
		}

		if ("on".equals(httpRequest.getParameter("checkbox401a"))) {
			totalInformation.getQuestions().get(3).setOption2(true);
			list.add("25% to 50%");
		}

		if ("on".equals(httpRequest.getParameter("checkbox402a"))) {
			totalInformation.getQuestions().get(3).setOption3(true);
			list.add("50% to 75%");
		}
		if ("on".equals(httpRequest.getParameter("checkbox403a"))) {
			totalInformation.getQuestions().get(3).setOption4(true);
			list.add("More than 75%");
		}
		totalInformation.getQuestions().get(3).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);
	}

	public void setQuestion_5a(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		resetOptions(totalInformation, 4);
		List<String> list = new ArrayList<String>();

		if ("on".equals(httpRequest.getParameter("checkbox500a"))) {
			totalInformation.getQuestions().get(4).setOption1(true);
			list.add("Waterfall");
			
		}

		if ("on".equals(httpRequest.getParameter("checkbox501a"))) {
			totalInformation.getQuestions().get(4).setOption2(true);
			list.add("Agile/Iteration");
		}

		if ("on".equals(httpRequest.getParameter("checkbox502a"))) {
			totalInformation.getQuestions().get(4).setOption3(true);
			list.add("DevOps/ CI / CD");
		}
		if ("on".equals(httpRequest.getParameter("checkbox503a"))) {
			totalInformation.getQuestions().get(4).setOther1(httpRequest.getParameter("questions[4].other1"));
			totalInformation.getQuestions().get(4).setOption6(true);
			list.add(httpRequest.getParameter("questions[4].other1"));
		}

		totalInformation.getQuestions().get(4).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);

	}
	
	public void setQuestion_6a(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		resetOptions(totalInformation, 5);
		List<String> list = new ArrayList<String>();

		if ("on".equals(httpRequest.getParameter("checkbox600a"))) {
			totalInformation.getQuestions().get(5).setOption1(true);
			list.add("Biweekly");
			
		}

		if ("on".equals(httpRequest.getParameter("checkbox601a"))) {
			totalInformation.getQuestions().get(5).setOption2(true);
			list.add("Monthly");
		}

		if ("on".equals(httpRequest.getParameter("checkbox602a"))) {
			totalInformation.getQuestions().get(5).setOption3(true);
			list.add("Quarterly");
		}
		if ("on".equals(httpRequest.getParameter("checkbox603a"))) {
			totalInformation.getQuestions().get(5).setOption4(true);
			list.add("Semi Annual");
		}
		if ("on".equals(httpRequest.getParameter("checkbox604a"))) {
			totalInformation.getQuestions().get(5).setOther1(httpRequest.getParameter("questions[5].other1"));
			totalInformation.getQuestions().get(5).setOption6(true);
			list.add(httpRequest.getParameter("questions[5].other1"));
		}

		totalInformation.getQuestions().get(5).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);

	}
	
	public void setQuestion_7a(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		resetOptions(totalInformation, 6);
		List<String> list = new ArrayList<String>();

		if ("on".equals(httpRequest.getParameter("checkbox700a"))) {
			totalInformation.getQuestions().get(6).setOption1(true);
			list.add("1 to 2");
			
		}

		if ("on".equals(httpRequest.getParameter("checkbox701a"))) {
			totalInformation.getQuestions().get(6).setOption2(true);
			list.add("2 to 5");
		}

		if ("on".equals(httpRequest.getParameter("checkbox702a"))) {
			totalInformation.getQuestions().get(6).setOption3(true);
			list.add("5 to 10");
		}
		if ("on".equals(httpRequest.getParameter("checkbox703a"))) {
			totalInformation.getQuestions().get(6).setOption3(true);
			list.add("More than 10");
		}
		totalInformation.getQuestions().get(6).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);
	
	}
	
	public void setQuestion_8a(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		resetOptions(totalInformation, 7);
		List<String> list = new ArrayList<String>();

		if ("on".equals(httpRequest.getParameter("checkbox800a"))) {
			totalInformation.getQuestions().get(7).setOption1(true);
			list.add("Less than 25%");
			
		}

		if ("on".equals(httpRequest.getParameter("checkbox801a"))) {
			totalInformation.getQuestions().get(7).setOption2(true);
			list.add("25% to 50%");
		}

		if ("on".equals(httpRequest.getParameter("checkbox802a"))) {
			totalInformation.getQuestions().get(7).setOption3(true);
			list.add("50% to 75%");
		}
		if ("on".equals(httpRequest.getParameter("checkbox803a"))) {
			totalInformation.getQuestions().get(7).setOption3(true);
			list.add("More than 75%");
		}
		totalInformation.getQuestions().get(7).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);
	
	}
	
	public void setQuestion_9a(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		resetOptions(totalInformation, 8);
		List<String> list = new ArrayList<String>();

		if ("on".equals(httpRequest.getParameter("checkbox900a"))) {
			totalInformation.getQuestions().get(8).setOption1(true);
			list.add("ALM");
			
		}

		if ("on".equals(httpRequest.getParameter("checkbox901a"))) {
			totalInformation.getQuestions().get(8).setOption2(true);
			list.add("TFS");
		}

		if ("on".equals(httpRequest.getParameter("checkbox902a"))) {
			totalInformation.getQuestions().get(8).setOption3(true);
			list.add("JIRA");
		}
		if ("on".equals(httpRequest.getParameter("checkbox903a"))) {
			totalInformation.getQuestions().get(8).setOption4(true);
			list.add("GITS");
		}
		
		if ("on".equals(httpRequest.getParameter("checkbox904a"))) {
			totalInformation.getQuestions().get(8).setOther1(httpRequest.getParameter("questions[8].other1"));
			totalInformation.getQuestions().get(8).setOption6(true);
			list.add(httpRequest.getParameter("questions[8].other1"));
		}
		totalInformation.getQuestions().get(8).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);
	
	}
	
	public void setQuestion_10a(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		resetOptions(totalInformation, 9);
		List<String> list = new ArrayList<String>();

		if ("on".equals(httpRequest.getParameter("checkbox1000a"))) {
			totalInformation.getQuestions().get(9).setOption1(true);
			list.add("IE");
			
		}

		if ("on".equals(httpRequest.getParameter("checkbox1001a"))) {
			totalInformation.getQuestions().get(9).setOption2(true);
			list.add("Firefox");
		}

		if ("on".equals(httpRequest.getParameter("checkbox1002a"))) {
			totalInformation.getQuestions().get(9).setOption3(true);
			list.add("Chrome");
		}
		if ("on".equals(httpRequest.getParameter("checkbox1003a"))) {
			totalInformation.getQuestions().get(9).setOption4(true);
			list.add("Safari");
		}
		totalInformation.getQuestions().get(9).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);
		}
	

	//Logic for Message_1 (1-5 questions)
	public TotalInformation setMessage1(TotalInformation totalInformation) {

		List<String> tools = totalInformation.getQuestions().get(1).getAnswer();
		List<String> platform = totalInformation.getQuestions().get(2).getAnswer();
		List<String> coverage = totalInformation.getQuestions().get(3).getAnswer();
		List<String> developmentCycle = totalInformation.getQuestions().get(4).getAnswer();

		if (!totalInformation.getQuestions().get(0).getAnswer().isEmpty()
				&& (totalInformation.getQuestions().get(0).getAnswer().contains(AppConstants.HP_QTP_UF_LeannFT)
						|| totalInformation.getQuestions().get(0).getAnswer().contains("IBM - RFT")
						|| totalInformation.getQuestions().get(0).getAnswer().contains("Microsoft - Coded UI")
						|| totalInformation.getQuestions().get(0).getAnswer().contains("Performance Testing Tool")
						|| totalInformation.getQuestions().get(0).isOption6())) {
			if (!totalInformation.getQuestions().get(1).getAnswer().isEmpty()
					&& totalInformation.getQuestions().get(1).getAnswer().contains("Record & Play")) {
				if (!platform.isEmpty() && (platform.contains("Web Application") || platform.contains("Mobile"))) {
					if (!coverage.isEmpty() && coverage.contains("More than 75%")) {
						if (!developmentCycle.isEmpty()) {
						    totalInformation.setMessage1(AppConstants.MESSAGE_4);
							totalInformation.setMessage1Color("Green");
						}
					} else if (!coverage.isEmpty()
							&& (coverage.contains("50% to 75%") || coverage.contains("25% to 50%"))) {
						if (!developmentCycle.isEmpty()) {
							totalInformation.setMessage1(AppConstants.MESSAGE_2D);
							totalInformation.setMessage1Color("Yellow");
						}
					} else if (!coverage.isEmpty() && coverage.contains("Less than 25%")) {
						if (!developmentCycle.isEmpty()) {
							totalInformation.setMessage1(AppConstants.MESSAGE_1D);
							totalInformation.setMessage1Color("Red");
						}
					}
				} else if (!platform.isEmpty()
						&& (platform.contains("Desktop/Thin/Thick") || platform.contains("Main Frame"))) {
					if (!coverage.isEmpty() && coverage.contains("More than 75%")) {
						if (!developmentCycle.isEmpty()) {
							totalInformation.setMessage1(AppConstants.MESSAGE_3B);
							totalInformation.setMessage1Color("Yellow");
						}
					} else if (!coverage.isEmpty()
							&& (coverage.contains("50% to 75%") || coverage.contains("25% to 50%"))) {
						if (!developmentCycle.isEmpty()) {
							totalInformation.setMessage1(AppConstants.MESSAGE_2C);
							totalInformation.setMessage1Color("Yellow");
						}
					} else if (!coverage.isEmpty() && coverage.contains("Less than 25%")) {
						if (!developmentCycle.isEmpty()) {
							totalInformation.setMessage1(AppConstants.MESSAGE_1C);
							totalInformation.setMessage1Color("Red");
						}
					}
				}

			}else if(!totalInformation.getQuestions().get(1).getAnswer().isEmpty() && (totalInformation.getQuestions().get(1).getAnswer().contains("Descriptive Programming") ||
					totalInformation.getQuestions().get(1).getAnswer().contains("Both") ) ) {
				
				if(!platform.isEmpty() && ( platform.contains("Web Application") || platform.contains("Mobile"))) {
					if(!coverage.isEmpty() && coverage.contains("More than 75%")) {
						if(!developmentCycle.isEmpty() ) {
							totalInformation.setMessage1(AppConstants.MESSAGE_7A);
							totalInformation.setMessage1Color("Green");
						}
					} else if(!coverage.isEmpty() && (coverage.contains("50% to 75%") || coverage.contains("25% to 50%"))) {
						if(!developmentCycle.isEmpty() ) {
							totalInformation.setMessage1(AppConstants.MESSAGE_6A);
							totalInformation.setMessage1Color("Yellow");
						}
					} else if(!coverage.isEmpty() && coverage.contains("Less than 25%")) {
						if(!developmentCycle.isEmpty() ) {
							totalInformation.setMessage1(AppConstants.MESSAGE_5A);
							totalInformation.setMessage1Color("Yellow");
						}
					} 
				}  else if(!platform.isEmpty() && ( platform.contains("Desktop/Thin/Thick") || platform.contains("Main Frame"))) {
					if(!coverage.isEmpty() && coverage.contains("More than 75%")) {
						if(!developmentCycle.isEmpty() ) {
							totalInformation.setMessage1(AppConstants.MESSAGE_7A);
							totalInformation.setMessage1Color("Green");
						}
					} else if(!coverage.isEmpty() && (coverage.contains("50% to 75%") || coverage.contains("25% to 50%"))) {
						if(!developmentCycle.isEmpty() ) {
							totalInformation.setMessage1(AppConstants.MESSAGE_6A);
							totalInformation.setMessage1Color("Yellow");
						}
					} else if(!coverage.isEmpty() && coverage.contains("Less than 25%")) {
						if(!developmentCycle.isEmpty() ) {
							totalInformation.setMessage1(AppConstants.MESSAGE_5A);
							totalInformation.setMessage1Color("Yellow");
						}
					}	
				}
			}
		}else if (!totalInformation.getQuestions().get(0).getAnswer().isEmpty() && (totalInformation.getQuestions().get(0).getAnswer().contains("Selenium") || totalInformation.getQuestions().get(0).isOption7())){
				if (!totalInformation.getQuestions().get(1).getAnswer().isEmpty()
						&& totalInformation.getQuestions().get(1).getAnswer().contains("Record & Play")) {
					if (!platform.isEmpty() && (platform.contains("Web Application") || platform.contains("Mobile"))) {
						if (!coverage.isEmpty() && coverage.contains("More than 75%")) {
							if (!developmentCycle.isEmpty()) {
								totalInformation.setMessage1(AppConstants.MESSAGE_4);
								totalInformation.setMessage1Color("Green");
							}
						} else if (!coverage.isEmpty()
								&& (coverage.contains("50% to 75%") || coverage.contains("25% to 50%"))) {
							if (!developmentCycle.isEmpty()) {
								totalInformation.setMessage1(AppConstants.MESSAGE_2B);
								totalInformation.setMessage1Color("Yellow");
							}
						} else if (!coverage.isEmpty() && coverage.contains("Less than 25%")) {
							if (!developmentCycle.isEmpty()) {
								totalInformation.setMessage1(AppConstants.MESSAGE_1B);
								totalInformation.setMessage1Color("Red");
							}
						}
					} else if (!platform.isEmpty()
							&& (platform.contains("Desktop/Thin/Thick") || platform.contains("Main Frame"))) {
						if (!coverage.isEmpty() && coverage.contains("More than 75%")) {
							if (!developmentCycle.isEmpty()) {
								totalInformation.setMessage1(AppConstants.MESSAGE_3A);
								totalInformation.setMessage1Color("Yellow");
							}
						} else if (!coverage.isEmpty()
								&& (coverage.contains("50% to 75%") || coverage.contains("25% to 50%"))) {
							if (!developmentCycle.isEmpty()) {
								totalInformation.setMessage1(AppConstants.MESSAGE_2A);
								totalInformation.setMessage1Color("Yellow");
							}
						} else if (!coverage.isEmpty() && coverage.contains("Less than 25%")) {
							if (!developmentCycle.isEmpty()) {
								totalInformation.setMessage1(AppConstants.MESSAGE_1A);
								totalInformation.setMessage1Color("Red");
							}
						}
					
					}

				}else if(!totalInformation.getQuestions().get(1).getAnswer().isEmpty() && (totalInformation.getQuestions().get(1).getAnswer().contains("Descriptive Programming") ||
						totalInformation.getQuestions().get(1).getAnswer().contains("Both") ) ) {
					
					if(!platform.isEmpty() && ( platform.contains("Web Application") || platform.contains("Mobile"))) {
						if(!coverage.isEmpty() && coverage.contains("More than 75%")) {
							if(!developmentCycle.isEmpty() ) {
								totalInformation.setMessage1(AppConstants.MESSAGE_7A);
								totalInformation.setMessage1Color("Green");
							}
						} else if(!coverage.isEmpty() && (coverage.contains("50% to 75%") || coverage.contains("25% to 50%"))) {
							if(!developmentCycle.isEmpty() ) {
								totalInformation.setMessage1(AppConstants.MESSAGE_6C);
								totalInformation.setMessage1Color("Yellow");
							}
						} else if(!coverage.isEmpty() && coverage.contains("Less than 25%")) {
							if(!developmentCycle.isEmpty() ) {
								totalInformation.setMessage1(AppConstants.MESSAGE_5B);
								totalInformation.setMessage1Color("Yellow");
							}
						} 
					}  else if(!platform.isEmpty() && ( platform.contains("Desktop/Thin/Thick") || platform.contains("Main Frame"))) {
						if(!coverage.isEmpty() && coverage.contains("More than 75%")) {
							// Pending
							if(!developmentCycle.isEmpty() ) {
								totalInformation.setMessage1(AppConstants.MESSAGE_7A);
								totalInformation.setMessage1Color("Green");
							}
						} else if(!coverage.isEmpty() && (coverage.contains("50% to 75%") || coverage.contains("25% to 50%"))) {
							if(!developmentCycle.isEmpty() ) {
								totalInformation.setMessage1(AppConstants.MESSAGE_6B);
								totalInformation.setMessage1Color("Yellow");
							}
						} else if(!coverage.isEmpty() && coverage.contains("Less than 25%")) {
							if(!developmentCycle.isEmpty() ) {
								totalInformation.setMessage1(AppConstants.MESSAGE_5B);
								totalInformation.setMessage1Color("Yellow");
							}
						}	
					}
				}
		
				
			}

		return totalInformation;

	}
	
	
	//Logic for Message_2 (5th & 6th questions)
	public TotalInformation setMessage2(TotalInformation totalInformation) {

		List<String> developmentCycle = totalInformation.getQuestions().get(4).getAnswer();
		List<String> releaseCycle = totalInformation.getQuestions().get(5).getAnswer();

		if (!developmentCycle.isEmpty()
				&& (developmentCycle.contains("Waterfall") || totalInformation.getQuestions().get(4).isOption6())) {
			if (!releaseCycle.isEmpty() && (releaseCycle.contains("Biweekly"))) {
				totalInformation.setMessage2(AppConstants.MESSAGE_8);
				totalInformation.setMessage2Color("Red");
			} 
		}
			else if (!developmentCycle.isEmpty()
					&& (developmentCycle.contains("Agile/Iteration") || developmentCycle.contains("DevOps/ CI / CD"))) {
				if (!releaseCycle.isEmpty()
						&& (releaseCycle.contains("Quarterly") || releaseCycle.contains("Semi Annual")
								|| totalInformation.getQuestions().get(5).isOption6())) {
					totalInformation.setMessage2(AppConstants.MESSAGE_8);
					totalInformation.setMessage2Color("Red");
				}

			}
				if (!developmentCycle.isEmpty()
				&& (developmentCycle.contains("Waterfall") || totalInformation.getQuestions().get(4).isOption6())) {
			if (!releaseCycle.isEmpty() && (releaseCycle.contains("Quarterly") || releaseCycle.contains("Semi Annual")
					|| totalInformation.getQuestions().get(5).isOption6())) {
				totalInformation.setMessage2(AppConstants.MESSAGE_9);
				totalInformation.setMessage2Color("Yellow");
			}
				}else if (!developmentCycle.isEmpty()
					&& (developmentCycle.contains("Agile/Iteration") || developmentCycle.contains("DevOps/ CI / CD"))) {
				if (!releaseCycle.isEmpty() && releaseCycle.contains("Monthly")) {
					totalInformation.setMessage2(AppConstants.MESSAGE_9);
					totalInformation.setMessage2Color("Yellow");
				}

			}
		
		if (!developmentCycle.isEmpty() && (developmentCycle.contains("Agile/Iteration") || developmentCycle.contains("DevOps/ CI / CD"))) {
			if (!releaseCycle.isEmpty() && releaseCycle.contains("Biweekly")) {
				totalInformation.setMessage2(AppConstants.MESSAGE_10);
				totalInformation.setMessage2Color("Green");
			} 
		}
		else if (!developmentCycle.isEmpty() && (developmentCycle.contains("Waterfall") || totalInformation.getQuestions().get(4).isOption6())) {
				if (!releaseCycle.isEmpty() && releaseCycle.contains("Monthly")) {
					totalInformation.setMessage2(AppConstants.MESSAGE_10);
					totalInformation.setMessage2Color("Green");
					
				}
				
			}
		
		return totalInformation;
	}
	
	// Logic for Message_3 (4th & 7th Questions)
	
	public TotalInformation setMessage3(TotalInformation totalInformation) {
		
		List<String> coverage = totalInformation.getQuestions().get(3).getAnswer();
		List<String> testers = totalInformation.getQuestions().get(6).getAnswer();
		
		if (!coverage.isEmpty() && (coverage.contains("Less than 25%") || coverage.contains("25% to 50%") )) {
			if (!testers.isEmpty() && (testers.contains("1 to 2") || testers.contains("2 to 5"))) {
				totalInformation.setMessage3(AppConstants.MESSAGE_11);
				totalInformation.setMessage3color("Red");
			} else if (!testers.isEmpty() && (testers.contains("5 to 10") || testers.contains("More than 10"))) {
				totalInformation.setMessage3(AppConstants.MESSAGE_12A);
				totalInformation.setMessage3color("Yellow");
			}
			
		} else if (!coverage.isEmpty() && coverage.contains("50% to 75%")) {
			if (!testers.isEmpty() && (testers.contains("1 to 2") || testers.contains("2 to 5"))) {
				totalInformation.setMessage3(AppConstants.MESSAGE_12B);
				totalInformation.setMessage3color("Yellow");
			} else if (!testers.isEmpty() && (testers.contains("5 to 10") || testers.contains("More than 10"))) {
				totalInformation.setMessage3(AppConstants.MESSAGE_12A);
				totalInformation.setMessage3color("Yellow");
			}
			
		} else if(!coverage.isEmpty() && coverage.contains("More than 75%")) {
			if (!testers.isEmpty() && (testers.contains("1 to 2") || testers.contains("2 to 5"))) {
				totalInformation.setMessage3(AppConstants.MESSAGE_12B);
				totalInformation.setMessage3color("Yellow");
			} else if (!testers.isEmpty() && (testers.contains("5 to 10") || testers.contains("More than 10"))) {
				totalInformation.setMessage3(AppConstants.MESSAGE_13);
				totalInformation.setMessage3color("Green");
			}
		}
		
	
		
		return totalInformation;
	}
	
	
	//Logic for Message_4(4th & 8th Questions)
	public TotalInformation setMessage4(TotalInformation totalInformation) {
		
		List<String> coverage = totalInformation.getQuestions().get(3).getAnswer();
		List<String> productionDefects = totalInformation.getQuestions().get(7).getAnswer();
		
		if (!coverage.isEmpty() && (coverage.contains("Less than 25%") || coverage.contains("25% to 50%") || coverage.contains("50% to 75%") || coverage.contains("More than 75%"))) {
			if (!productionDefects.isEmpty() && productionDefects.contains("Less than 25%")) {
				totalInformation.setMessage4(AppConstants.MESSAGE_14);
				totalInformation.setMessage4color("Red");				
			} else if (!productionDefects.isEmpty() && (productionDefects.contains("25% to 50%") || productionDefects.contains("50% to 75%"))) {
				totalInformation.setMessage4(AppConstants.MESSAGE_15);
				totalInformation.setMessage4color("Yellow");
			} 		
		} else if (!coverage.isEmpty()) {
			if (!productionDefects.isEmpty() && productionDefects.contains("More than 75%")) {
				totalInformation.setMessage4(AppConstants.MESSAGE_16);
				totalInformation.setMessage4color("Green");				
		}
	}
		
		return totalInformation;
	}
	
}
