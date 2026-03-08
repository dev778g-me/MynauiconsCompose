package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.FileText: ImageVector
    get() {
        if (_FileText != null) {
            return _FileText!!
        }
        _FileText = ImageVector.Builder(
            name = "Filled.FileText",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 2.25f)
                horizontalLineToRelative(2.228f)
                curveToRelative(1.093f, 0f, 2.245f, 0.393f, 3.327f, 0.987f)
                curveToRelative(1.09f, 0.598f, 2.159f, 1.428f, 3.098f, 2.368f)
                reflectiveCurveToRelative(1.767f, 2.006f, 2.364f, 3.092f)
                curveToRelative(0.591f, 1.077f, 0.983f, 2.221f, 0.983f, 3.303f)
                verticalLineToRelative(6.75f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineToRelative(-9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                lineTo(4.5f, 5.25f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                moveToRelative(7.592f, 4.415f)
                arcToRelative(13f, 13f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.38f, -1.894f)
                quadToRelative(0.038f, 0.234f, 0.038f, 0.479f)
                lineTo(12.75f, 7.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 1.5f)
                horizontalLineToRelative(2.25f)
                quadToRelative(0.246f, 0f, 0.481f, 0.038f)
                arcToRelative(13f, 13f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.889f, -2.373f)
                moveTo(9f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
                moveTo(9f, 15.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
            }
        }.build()

        return _FileText!!
    }

@Suppress("ObjectPropertyName")
private var _FileText: ImageVector? = null
