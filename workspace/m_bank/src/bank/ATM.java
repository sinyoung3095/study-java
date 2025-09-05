package bank;

import java.util.Random;
import java.util.Scanner;

public class ATM {
//   화면

	public static void main(String[] args) {
//		은행배열 생성
		Bank[][] arrBank = new Bank[3][100];
//		은행 가입자 수 카운트 생성
		int[] arCount = new int[arrBank.length];
//		은행이름 배열 생성
		String[] arBankName = { "신한은행", "국민은행", "카카오뱅크" };

		String message = "1. 신한은행\n2. 국민은행\n3. 카카오뱅크\n4. 나가기";
		String menu = "1. 계좌개설\n2. 입금하기\n3. 출금하기\n4. 잔액조회\n5. 계좌번호 찾기\n6. 은행 선택 메뉴로 돌아가기";
		Scanner sc = new Scanner(System.in);

//		은행 번호, 선택, 내 번호 변수 생성
		int bankNumber = 0, choice = 0, myBankNumber = 0;
//		계좌, 비밀번호, 핸드폰, 이름 변수 생성
		String account = null, password = null, phone = null, name = null;
		
//		유저 객체 생성
		Bank user = null;
//		머니, 출금액, 임시 변수 생성
		int money = 0, withdrawMoney = 0, temp = 0;
//		랜덤 클래스 호출
		Random random = new Random();
//		비밀번호, 핸드폰번호 체크를 위한 변수 생성
		int passwordCheck = 0, phoneCheck = 0;

//		필요 메세지 생성
		String accountMessage = "계좌번호: ";
		String nameMessage = "예금주: ";
		String passwordMessage = "비밀번호(4자리): ";
		String phoneMessage = "핸드폰번호(- 제외): ";
		String depositMessage = "입금액: ";
		String withdrawMessage = "출금액: ";
		String errorMessage = "다시 시도해주세요.";
		String loginFailMessage = "계좌번호 혹은 비밀번호를 다시 확인해주세요.";

//		반복문으로 반복
		while (true) {
//			메시지 출력
			System.out.println(message);
//			은행 선택 목록번호 저장
			bankNumber = sc.nextInt();
//			은행 선택 목록번호가 4면 종료
			if (bankNumber == 4) {
				break;
			}
//			은행 선택 목록번호 4가 아니면 번호에 1을 빼서 인덱스 번호화
			bankNumber--;
//			언제 끝날지 모르기 때문에 while문으로 반복
			while (true) {
//				메뉴창 호출
				System.out.println(menu);
//				선택한 숫자 저장
				choice = sc.nextInt();
//				선택한 숫자가 6이면 브레이크
				if (choice == 6) {
					break;
				}
				
//  			선택한 숫자가 1~5이면 변수 한개에 여러가지 대입 가능하므로 switch 문 사용
				switch (choice) {
				case 1: // 계좌 개설
//					객체를 배열로 선언
					Bank[] arBank = { new Shinhan(), new Kookmin(), new Kakao() };
//					횟수를 모르기 때문에 while반복문 사용
					while (true) {
//						계좌에 랜덤함수를 사용 100000만 부터 시작해야 하므로 +100000하기
						account = String.valueOf(random.nextInt(900000) + 100000);
//						계좌에다 은행 번호와 위에서 나온 숫자 합치기
						account = bankNumber + account;
//						계좌 중복검사 사용
						if (Bank.checkAccount(arrBank, arCount, account) == null) {
							break;
						}
					}
//					입금주 메시지 출력
					System.out.println(nameMessage);
//					이름에 입력받은 문자 저장
					name = sc.next();

//					횟수를 모르기 때문에 while반복문 사용
					while (true) {
//						비밀번호 메시지 출력
						System.out.println(passwordMessage);
//						비밀번호에 입력받은 문자 저장
						password = sc.next();
//						패스워드체크 0으로 초기화
						passwordCheck = 0;
//						패스워드가 4이면 if문 적용
						if (password.length() == 4) {
//							패스워드만큼의 반복
							for (int i = 0; i < password.length(); i++) {
//								패스워드 i번째에 숫자를 문자로 저장
								char c = password.charAt(i);
//								숫자 48~57에 들어가면
								if (c >= 48 && c <= 57) {
//									패스워드 체크 1증가
									passwordCheck++;
								}
							}
						}
//						패스워드 체크가 4로 끝나면 브레이크
						if (passwordCheck == 4) {
							break;
						}
					}
//					횟수를 모르기 때문에 while반복문 사용
					while (true) {
//						폰메시지 출력
						System.out.println(phoneMessage);
//						폰에 입력받은 문자 저장
						phone = sc.next();
//						폰체크 초기화
						phoneCheck = 0;

//						-포함되어 있으면 -제거후 저장
						phone = phone.replaceAll("-", "");

//						입력받은 문자가 11개이면 
						if (phone.length() == 11) {
//							11번 반복
							for (int i = 0; i < phone.length(); i++) {
								char c = phone.charAt(i);
								if (c >= 48 && c <= 57) {
									phoneCheck++;
								}
							}

							if (phoneCheck == 11) {
								if (Bank.checkPhone(arrBank, arCount, phone) == null) {
									break;
								}
							}
						}
					}

					user = arBank[bankNumber];

					user.setAccount(account);
					user.setName(name);
					user.setPassword(password);
					user.setPhone(phone);

					arrBank[bankNumber][arCount[bankNumber]++] = user;

					System.out.println(arBankName[bankNumber] + " 가입을 진심으로 환영합니다.");
					System.out.println("고객님의 소중한 계좌번호: " + account);
					break;
				case 2: // 입금 하기
					System.out.println(accountMessage);
					account = sc.next();

					System.out.println(passwordMessage);
					password = sc.next();

					user = Bank.login(arrBank, arCount, account, password);

					if (user != null) {
						myBankNumber = user.getAccount().charAt(0) - 48;
						if (myBankNumber == bankNumber) {
							System.out.println(depositMessage);
							money = sc.nextInt();

							if (money > 0) {
								user.deposit(money);
								System.out.println("현재 잔액: " + user.getMoney() + "원");
							} else {
								System.out.println(errorMessage);
							}
						} else {
							System.out.println(arBankName[myBankNumber] + " 은행에서만 입금 서비스를 이용하실 수 있습니다.");
						}

//                  현 로직에서 instanceof를 통해 고객의 은행사를 구분하는 것은 무리가 있다.
//                  그래서 계좌번호 맨 앞 숫자로 검사하는 것이 낫다.
//                  if(bankNumber == 0) {
//                     if(user instanceof Shinhan) {
//                        System.out.println(depositMessage);
//                        money = sc.nextInt();
//                        
//                        user.deposit(돈);
//                     }
//                  }else if(bankNumber == 1) {
//                     if(user instanceof Kookmin) {
//                        System.out.println(depositMessage);
//                        money = sc.nextInt();
//                        
//                        user.deposit(돈);
//                     }
//                  }else if(bankNumber == 2) {
//                     if(user instanceof Kakao) {
//                        System.out.println(depositMessage);
//                        money = sc.nextInt();
//                        
//                        user.deposit(돈);
//                     }
//                  }
					} else {
						System.out.println(loginFailMessage);
					}
					break;
				case 3: // 출금 하기
					System.out.println(accountMessage);
					account = sc.next();

					System.out.println(passwordMessage);
					password = sc.next();

					user = Bank.login(arrBank, arCount, account, password);

					if (user != null) {
						System.out.println(withdrawMessage);
						withdrawMoney = sc.nextInt();

						temp = user instanceof Kookmin ? (int) (withdrawMoney * 1.5) : withdrawMoney;

						if (withdrawMoney > 0) {
							if (temp <= user.getMoney()) {
								user.withdraw(withdrawMoney);
								System.out.println("현재 잔액: " + user.getMoney() + "원");

							} else {
								System.out.println(errorMessage);
							}

						} else {
							System.out.println(errorMessage);
						}
					} else {
						System.out.println(loginFailMessage);
					}
					break;
				case 4: // 잔액 조회
					System.out.println(accountMessage);
					account = sc.next();

					System.out.println(passwordMessage);
					password = sc.next();

					user = Bank.login(arrBank, arCount, account, password);
					if (user != null) {
						System.out.println("현재 잔액: " + user.showBalance() + "원");
					}
					break;
				case 5: // 계좌번호 찾기
					System.out.println(phoneMessage);
					phone = sc.next();

					System.out.println(passwordMessage);
					password = sc.next();

					user = Bank.checkPhone(arrBank, arCount, phone);
					if (user != null) {
						while (true) {
							account = String.valueOf(random.nextInt(900000) + 100000);
							account = bankNumber + account;
							if (Bank.checkAccount(arrBank, arCount, account) == null) {
								break;
							}
						}

						user.setAccount(account);
						System.out.println("고객님의 소중한 계좌번호: " + account);
					} else {
						System.out.println(errorMessage);

					}
					break;

				default:
					System.out.println(errorMessage);
					break;
				}

			}
		}
	}
}
