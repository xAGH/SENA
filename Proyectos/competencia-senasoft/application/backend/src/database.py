from pymysql import Connection, connect, MySQLError

class Connection:

    mysql: Connection

    @classmethod
    def open_connection(cls):
        try:
            cls.mysql = connect(host="localhost", user="root", password="", database="siigo_bugfinder", port=3306)
            return cls.mysql
        except MySQLError as me:
            raise me
        except Exception as e:
            print("Error: {0}".format(e))
            raise e