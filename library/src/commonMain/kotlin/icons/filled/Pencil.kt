package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Pencil: ImageVector
    get() {
        if (_Pencil != null) {
            return _Pencil!!
        }
        _Pencil = ImageVector.Builder(
            name = "Filled.Pencil",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.678f, 3.272f)
                arcToRelative(3.483f, 3.483f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.928f, -0.001f)
                lineToRelative(1.127f, 1.127f)
                arcToRelative(3.483f, 3.483f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.925f)
                lineTo(9.33f, 20.729f)
                arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.463f, 1.021f)
                lineTo(3f, 21.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                verticalLineToRelative(-3.844f)
                arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.019f, -2.461f)
                close()
                moveTo(18.545f, 4.332f)
                arcToRelative(1.983f, 1.983f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.806f, 0f)
                lineToRelative(-0.896f, 0.897f)
                lineToRelative(3.931f, 3.931f)
                lineToRelative(0.898f, -0.898f)
                arcToRelative(1.983f, 1.983f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.804f)
                close()
            }
        }.build()

        return _Pencil!!
    }

@Suppress("ObjectPropertyName")
private var _Pencil: ImageVector? = null
