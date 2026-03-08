package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Slack: ImageVector
    get() {
        if (_Slack != null) {
            return _Slack!!
        }
        _Slack = ImageVector.Builder(
            name = "Filled.Slack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.25f, 2.52f)
                curveToRelative(-1.288f, 0f, -2.46f, 1.03f, -2.46f, 2.46f)
                verticalLineToRelative(4.14f)
                curveToRelative(0f, 1.288f, 1.03f, 2.46f, 2.46f, 2.46f)
                curveToRelative(1.288f, 0f, 2.46f, -1.03f, 2.46f, -2.46f)
                lineTo(16.71f, 4.89f)
                curveToRelative(0f, -1.34f, -1.083f, -2.37f, -2.46f, -2.37f)
                moveToRelative(5.13f, 4.59f)
                curveToRelative(-1.224f, 0f, -2.19f, 0.966f, -2.19f, 2.19f)
                verticalLineToRelative(1.44f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(1.44f)
                curveToRelative(1.224f, 0f, 2.19f, -0.966f, 2.19f, -2.19f)
                reflectiveCurveToRelative(-0.966f, -2.19f, -2.19f, -2.19f)
                moveTo(4.71f, 7.02f)
                lineToRelative(-0.068f, 0.003f)
                curveToRelative(-1.314f, 0.12f, -2.392f, 1.11f, -2.392f, 2.457f)
                curveToRelative(0f, 1.288f, 1.03f, 2.46f, 2.46f, 2.46f)
                horizontalLineToRelative(4.14f)
                curveToRelative(1.288f, 0f, 2.46f, -1.03f, 2.46f, -2.46f)
                curveToRelative(0f, -1.288f, -1.03f, -2.46f, -2.46f, -2.46f)
                close()
                moveTo(9.12f, 2.25f)
                curveToRelative(-1.224f, 0f, -2.19f, 0.966f, -2.19f, 2.19f)
                reflectiveCurveToRelative(0.966f, 2.19f, 2.19f, 2.19f)
                horizontalLineToRelative(1.44f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, -0.75f)
                lineTo(11.31f, 4.44f)
                curveToRelative(0f, -1.224f, -0.966f, -2.19f, -2.19f, -2.19f)
                moveToRelative(0.54f, 10.26f)
                curveToRelative(-1.288f, 0f, -2.46f, 1.03f, -2.46f, 2.46f)
                verticalLineToRelative(4.14f)
                quadToRelative(0f, 0.038f, 0.004f, 0.075f)
                curveToRelative(0.119f, 1.188f, 1.082f, 2.385f, 2.456f, 2.385f)
                curveToRelative(1.288f, 0f, 2.46f, -1.03f, 2.46f, -2.46f)
                verticalLineToRelative(-4.14f)
                curveToRelative(0f, -1.288f, -1.03f, -2.46f, -2.46f, -2.46f)
                moveToRelative(-5.04f, 0f)
                curveToRelative(-1.224f, 0f, -2.19f, 0.966f, -2.19f, 2.19f)
                reflectiveCurveToRelative(0.966f, 2.19f, 2.19f, 2.19f)
                reflectiveCurveToRelative(2.19f, -0.966f, 2.19f, -2.19f)
                verticalLineToRelative(-1.44f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, -0.75f)
                close()
                moveTo(15.15f, 12.06f)
                curveToRelative(-1.288f, 0f, -2.46f, 1.03f, -2.46f, 2.46f)
                curveToRelative(0f, 1.288f, 1.03f, 2.46f, 2.46f, 2.46f)
                horizontalLineToRelative(4.14f)
                curveToRelative(1.314f, 0f, 2.46f, -1.146f, 2.46f, -2.46f)
                curveToRelative(0f, -1.288f, -1.03f, -2.46f, -2.46f, -2.46f)
                close()
                moveTo(13.44f, 17.37f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.75f)
                verticalLineToRelative(1.44f)
                curveToRelative(0f, 1.224f, 0.966f, 2.19f, 2.19f, 2.19f)
                reflectiveCurveToRelative(2.19f, -0.966f, 2.19f, -2.19f)
                reflectiveCurveToRelative(-0.966f, -2.19f, -2.19f, -2.19f)
                close()
            }
        }.build()

        return _Slack!!
    }

@Suppress("ObjectPropertyName")
private var _Slack: ImageVector? = null
