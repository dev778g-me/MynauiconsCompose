package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.MoveDiagonal: ImageVector
    get() {
        if (_MoveDiagonal != null) {
            return _MoveDiagonal!!
        }
        _MoveDiagonal = ImageVector.Builder(
            name = "Outline.MoveDiagonal",
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
                moveTo(13f, 5f)
                horizontalLineToRelative(6f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(6f)
                moveToRelative(0f, -6f)
                lineTo(5f, 19f)
                moveToRelative(6f, 0f)
                horizontalLineTo(5f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(-6f)
            }
        }.build()

        return _MoveDiagonal!!
    }

@Suppress("ObjectPropertyName")
private var _MoveDiagonal: ImageVector? = null
