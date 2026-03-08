package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Aperture: ImageVector
    get() {
        if (_Aperture != null) {
            return _Aperture!!
        }
        _Aperture = ImageVector.Builder(
            name = "Outline.Aperture",
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
                moveToRelative(14.079f, 8.4f)
                lineToRelative(5.166f, 8.946f)
                moveTo(9.921f, 8.4f)
                horizontalLineToRelative(10.332f)
                moveTo(7.842f, 12f)
                lineToRelative(5.166f, -8.946f)
                moveTo(9.921f, 15.6f)
                lineTo(4.755f, 6.654f)
                moveTo(14.08f, 15.6f)
                horizontalLineTo(3.746f)
                moveTo(16.158f, 12f)
                lineToRelative(-5.166f, 8.946f)
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
            }
        }.build()

        return _Aperture!!
    }

@Suppress("ObjectPropertyName")
private var _Aperture: ImageVector? = null
