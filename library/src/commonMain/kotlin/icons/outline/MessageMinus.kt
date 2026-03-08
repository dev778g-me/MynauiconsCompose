package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.MessageMinus: ImageVector
    get() {
        if (_MessageMinus != null) {
            return _MessageMinus!!
        }
        _MessageMinus = ImageVector.Builder(
            name = "Outline.MessageMinus",
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
                moveTo(3.464f, 16.828f)
                curveTo(2f, 15.657f, 2f, 14.771f, 2f, 11f)
                reflectiveCurveToRelative(0f, -5.657f, 1.464f, -6.828f)
                curveTo(4.93f, 3f, 7.286f, 3f, 12f, 3f)
                reflectiveCurveToRelative(7.071f, 0f, 8.535f, 1.172f)
                reflectiveCurveTo(22f, 7.229f, 22f, 11f)
                reflectiveCurveToRelative(0f, 4.657f, -1.465f, 5.828f)
                curveTo(19.072f, 18f, 16.714f, 18f, 12f, 18f)
                curveToRelative(-2.51f, 0f, -3.8f, 1.738f, -6f, 3f)
                verticalLineToRelative(-3.212f)
                curveToRelative(-1.094f, -0.163f, -1.899f, -0.45f, -2.536f, -0.96f)
                moveTo(9.5f, 10.5f)
                horizontalLineToRelative(5f)
            }
        }.build()

        return _MessageMinus!!
    }

@Suppress("ObjectPropertyName")
private var _MessageMinus: ImageVector? = null
