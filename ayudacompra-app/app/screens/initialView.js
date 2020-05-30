import React from "react";
import { StyleSheet, Text, View, Alert } from "react-native";
import { Button } from "react-native-elements";

const InitialView = () => {
  return (
    <View style={styles.container}>
      <Text style={styles.titleText}>AyudaCompra</Text>
      <Button
        large
        rightIcon={{ name: "helpRequestButton" }}
        title="Solicitar Ayuda"
        buttonStyle={{
          backgroundColor: "#27AE60",
          width: "100%",
          marginBottom: "2%",
        }}
      />

      <Button
        large
        rightIcon={{ name: "requestDashboardButton" }}
        title="Entregar Ayuda"
        buttonStyle={{
          backgroundColor: "#27AE60",
          width: "100%",
        }}
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

export default InitialView;
