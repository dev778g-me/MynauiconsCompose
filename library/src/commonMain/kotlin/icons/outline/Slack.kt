package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Slack: ImageVector
    get() {
        if (_Slack != null) {
            return _Slack!!
        }
        _Slack = ImageVector.Builder(
            name = "Outline.Slack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.44f, 18.12f)
                verticalLineToRelative(1.44f)
                curveToRelative(0f, 0.81f, 0.63f, 1.44f, 1.44f, 1.44f)
                reflectiveCurveToRelative(1.44f, -0.63f, 1.44f, -1.44f)
                reflectiveCurveToRelative(-0.63f, -1.44f, -1.44f, -1.44f)
                close()
                moveTo(21f, 14.52f)
                curveToRelative(0f, -0.9f, -0.72f, -1.71f, -1.71f, -1.71f)
                horizontalLineToRelative(-4.14f)
                curveToRelative(-0.9f, 0f, -1.71f, 0.72f, -1.71f, 1.71f)
                curveToRelative(0f, 0.9f, 0.72f, 1.71f, 1.71f, 1.71f)
                horizontalLineToRelative(4.14f)
                curveToRelative(0.9f, 0f, 1.71f, -0.81f, 1.71f, -1.71f)
                moveTo(6.06f, 13.26f)
                lineTo(4.62f, 13.26f)
                curveToRelative(-0.81f, 0f, -1.44f, 0.63f, -1.44f, 1.44f)
                reflectiveCurveToRelative(0.63f, 1.44f, 1.44f, 1.44f)
                reflectiveCurveToRelative(1.44f, -0.63f, 1.44f, -1.44f)
                close()
                moveTo(9.66f, 20.82f)
                curveToRelative(0.9f, 0f, 1.71f, -0.72f, 1.71f, -1.71f)
                verticalLineToRelative(-4.14f)
                curveToRelative(0f, -0.9f, -0.72f, -1.71f, -1.71f, -1.71f)
                curveToRelative(-0.9f, 0f, -1.71f, 0.72f, -1.71f, 1.71f)
                verticalLineToRelative(4.14f)
                curveToRelative(0.09f, 0.9f, 0.81f, 1.71f, 1.71f, 1.71f)
                moveToRelative(0.9f, -16.38f)
                curveToRelative(0f, -0.81f, -0.63f, -1.44f, -1.44f, -1.44f)
                reflectiveCurveToRelative(-1.44f, 0.63f, -1.44f, 1.44f)
                reflectiveCurveToRelative(0.63f, 1.44f, 1.44f, 1.44f)
                horizontalLineToRelative(1.44f)
                close()
                moveTo(3f, 9.48f)
                curveToRelative(0f, 0.9f, 0.72f, 1.71f, 1.71f, 1.71f)
                horizontalLineToRelative(4.14f)
                curveToRelative(0.9f, 0f, 1.71f, -0.72f, 1.71f, -1.71f)
                curveToRelative(0f, -0.9f, -0.72f, -1.71f, -1.71f, -1.71f)
                lineTo(4.71f, 7.77f)
                curveTo(3.72f, 7.86f, 3f, 8.58f, 3f, 9.48f)
                moveToRelative(14.94f, 1.26f)
                horizontalLineToRelative(1.44f)
                curveToRelative(0.81f, 0f, 1.44f, -0.63f, 1.44f, -1.44f)
                reflectiveCurveToRelative(-0.63f, -1.44f, -1.44f, -1.44f)
                reflectiveCurveToRelative(-1.44f, 0.63f, -1.44f, 1.44f)
                close()
                moveTo(14.25f, 3.27f)
                curveToRelative(-0.9f, 0f, -1.71f, 0.72f, -1.71f, 1.71f)
                verticalLineToRelative(4.14f)
                curveToRelative(0f, 0.9f, 0.72f, 1.71f, 1.71f, 1.71f)
                curveToRelative(0.9f, 0f, 1.71f, -0.72f, 1.71f, -1.71f)
                lineTo(15.96f, 4.89f)
                curveToRelative(0f, -0.9f, -0.72f, -1.62f, -1.71f, -1.62f)
            }
        }.build()

        return _Slack!!
    }

@Suppress("ObjectPropertyName")
private var _Slack: ImageVector? = null
