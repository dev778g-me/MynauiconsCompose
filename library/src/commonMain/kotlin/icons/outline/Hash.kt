package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Hash: ImageVector
    get() {
        if (_Hash != null) {
            return _Hash!!
        }
        _Hash = ImageVector.Builder(
            name = "Outline.Hash",
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
                moveTo(9.697f, 4f)
                lineTo(6.678f, 21f)
                moveTo(17.054f, 4f)
                lineToRelative(-3.019f, 17f)
                moveTo(21f, 8.781f)
                horizontalLineTo(3f)
                moveToRelative(18f, 7.438f)
                horizontalLineTo(3f)
            }
        }.build()

        return _Hash!!
    }

@Suppress("ObjectPropertyName")
private var _Hash: ImageVector? = null
