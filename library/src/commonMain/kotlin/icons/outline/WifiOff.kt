package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.WifiOff: ImageVector
    get() {
        if (_WifiOff != null) {
            return _WifiOff!!
        }
        _WifiOff = ImageVector.Builder(
            name = "Outline.WifiOff",
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
                moveTo(22f, 9.483f)
                arcToRelative(14.5f, 14.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.5f, -2.907f)
                moveTo(19f, 12.9f)
                arcToRelative(9.85f, 9.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -2.697f)
                moveTo(5f, 12.9f)
                arcToRelative(9.86f, 9.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -2.437f)
                moveToRelative(3f, 8.787f)
                verticalLineToRelative(-0.5f)
                moveTo(3f, 21f)
                lineTo(21f, 3f)
                moveTo(2f, 9.483f)
                arcTo(14.5f, 14.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 5.5f)
                moveToRelative(4f, 10.657f)
                arcToRelative(5.657f, 5.657f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 0f)
            }
        }.build()

        return _WifiOff!!
    }

@Suppress("ObjectPropertyName")
private var _WifiOff: ImageVector? = null
