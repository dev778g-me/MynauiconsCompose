package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Rupee: ImageVector
    get() {
        if (_Rupee != null) {
            return _Rupee!!
        }
        _Rupee = ImageVector.Builder(
            name = "Outline.Rupee",
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
                moveTo(6.5f, 3.5f)
                horizontalLineToRelative(11f)
                moveToRelative(-11f, 4.722f)
                horizontalLineToRelative(11f)
                moveTo(14.292f, 20.5f)
                lineTo(6.5f, 12.944f)
                horizontalLineToRelative(2.75f)
                curveToRelative(6.111f, 0f, 6.111f, -9.444f, 0f, -9.444f)
            }
        }.build()

        return _Rupee!!
    }

@Suppress("ObjectPropertyName")
private var _Rupee: ImageVector? = null
