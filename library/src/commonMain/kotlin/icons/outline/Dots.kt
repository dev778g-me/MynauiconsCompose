package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Dots: ImageVector
    get() {
        if (_Dots != null) {
            return _Dots!!
        }
        _Dots = ImageVector.Builder(
            name = "Outline.Dots",
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
                moveTo(12f, 12.25f)
                verticalLineToRelative(-0.5f)
                moveToRelative(4f, 0.5f)
                verticalLineToRelative(-0.5f)
                moveToRelative(-8f, 0.5f)
                verticalLineToRelative(-0.5f)
            }
        }.build()

        return _Dots!!
    }

@Suppress("ObjectPropertyName")
private var _Dots: ImageVector? = null
