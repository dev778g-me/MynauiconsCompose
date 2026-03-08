package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Four: ImageVector
    get() {
        if (_Four != null) {
            return _Four!!
        }
        _Four = ImageVector.Builder(
            name = "Outline.Four",
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
                moveTo(12.917f, 7f)
                curveToRelative(-1.042f, 3.75f, -4.167f, 6.875f, -4.167f, 6.875f)
                horizontalLineTo(15f)
                moveTo(13.438f, 17f)
                verticalLineToRelative(-5f)
            }
        }.build()

        return _Four!!
    }

@Suppress("ObjectPropertyName")
private var _Four: ImageVector? = null
