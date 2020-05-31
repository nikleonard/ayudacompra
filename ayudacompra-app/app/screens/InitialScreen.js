import "react-native-gesture-handler";
import React from "react";
import { StyleSheet, Text, View } from "react-native";
import { Button } from "react-native-elements";

const InitialScreen = ({ navigation }) => {
  return (
    <View style={styles.container}>
      <Text style={styles.titleText}>AyudaCompra</Text>
      <Button
        large
        rightIcon={{ name: "HelpRequestButton" }}
        title="Solicitar Ayuda"
        buttonStyle={{
          backgroundColor: "#27AE60",
          width: "100%",
          marginBottom: "2%",
        }}
        onPress={() => navigation.navigate("HelpRequestScreen")}
      />

      <Button
        large
        rightIcon={{ name: "requestDashboardButton" }}
        title="Entregar Ayuda"
        buttonStyle={{
          backgroundColor: "#27AE60",
          width: "100%",
        }}
        onPress={() => navigation.navigate("RequestDashboardScreen")}
      />
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#fff",
    alignItems: "center",
    justifyContent: "center",
  },
  titleText: {
    fontSize: 20,
    fontWeight: "bold",
  },
});

export default InitialScreen;
