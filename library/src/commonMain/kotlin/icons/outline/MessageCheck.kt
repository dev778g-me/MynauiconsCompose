package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.MessageCheck: ImageVector
    get() {
        if (_MessageCheck != null) {
            return _MessageCheck!!
        }
        _MessageCheck = ImageVector.Builder(
            name = "Outline.MessageCheck",
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
                moveToRelative(9.7f, 10.823f)
                lineToRelative(1.379f, 1.575f)
                arcToRelative(0.3f, 0.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.466f, -0.022f)
                lineToRelative(2.8f, -3.876f)
            }
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
            }
        }.build()

        return _MessageCheck!!
    }

@Suppress("ObjectPropertyName")
private var _MessageCheck: ImageVector? = null
