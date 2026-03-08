package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Trees: ImageVector
    get() {
        if (_Trees != null) {
            return _Trees!!
        }
        _Trees = ImageVector.Builder(
            name = "Filled.Trees",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.25f, 19f)
                verticalLineToRelative(-1.25f)
                horizontalLineToRelative(-3.5f)
                verticalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-3.25f)
                horizontalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.616f, -1.177f)
                lineToRelative(3.685f, -5.323f)
                horizontalLineTo(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.604f, -1.193f)
                lineToRelative(5.5f, -7.5f)
                lineToRelative(0.056f, -0.069f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.153f, 0.069f)
                lineToRelative(2.444f, 3.333f)
                lineToRelative(1.42f, -1.42f)
                lineToRelative(0.061f, -0.055f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.075f, 0.142f)
                lineToRelative(5.5f, 7.5f)
                lineToRelative(0.056f, 0.088f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.66f, 1.105f)
                horizontalLineToRelative(-1.468f)
                lineToRelative(2.559f, 3.29f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 17.75f)
                horizontalLineToRelative(-5.25f)
                verticalLineTo(19f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
            }
        }.build()

        return _Trees!!
    }

@Suppress("ObjectPropertyName")
private var _Trees: ImageVector? = null
