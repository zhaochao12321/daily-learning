import yagmail


def send_mail(email_address, topical, contents):
    yag = yagmail.SMTP(user='123@126.com', password='SMSRDEQCIUKYODOR', host='smtp.126.com')
    # contents = ['我是个快乐的小精灵']
    yag.send(email_address, topical, contents)
    yag.close()
